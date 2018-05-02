package com.education.tutor.web.security;

import com.education.tutor.Application;
import com.education.tutor.api.ErrorRes;
import com.education.tutor.config.KeyDef;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.service.I18nService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.input.TeeInputStream;
import org.apache.commons.io.output.TeeOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	RegiUserDetailService userDetailService;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	I18nService i18nService;

	ObjectMapper om = new ObjectMapper();

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Value("${spring.kafka.event.logger.topic}")
	String topic;

	public void sendMessage(String message) {
		ListenableFuture<SendResult<String, String>> result = kafkaTemplate.send(topic, message);
		result.addCallback(sendResult -> {
			// logger.debug("send Result ProducerRecord " +
			// sendResult.getProducerRecord().toString());
			// logger.debug("send Result RecordMetadata " +
			// sendResult.getRecordMetadata().topic() + ":"
			// + sendResult.getRecordMetadata().timestamp() + ":" +
			// sendResult.getRecordMetadata().checksum());
			logger.debug("kafka send succ");
		}, exception -> {
			exception.printStackTrace();
			logger.error("kafka send fail\n" + exception.getMessage());
		});
	}

	public void handleErrorRes(int errorCode, String lang, HttpServletResponse response)
			throws ServletException, IOException {
		ErrorRes res = new ErrorRes();
		res.setCode(errorCode);
		res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
		response.setStatus(200);
		String data = om.writeValueAsString(res);
		response.setContentType("application/json");
		response.getWriter().write(data);
		response.flushBuffer();
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		if (request.getRequestURI().equals("/")) {
			return;
		}
		String authToken = request.getHeader(KeyDef.tokenHeader);
		logger.debug("authToken:" + authToken);
		String username = null;
		if (authToken != null) {
			// authToken.startsWith("Bearer ")
			// String authToken = header.substring(7);
			username = jwtTokenUtil.getUsernameFromToken(authToken);
			if (username == null) {
				handleErrorRes(1101, Application.DEFAULT_LANG, response);
				return;
			}
			logger.debug("checking authentication for user " + username);
			if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				// It is not compelling necessary to load the use details from
				// the database. You could also store the information
				// in the token and read it from it. It's up to you ;)
				RegiUserDetails userDetails = null;
				try {
					userDetails = (RegiUserDetails) userDetailService.loadUserByUsername(username);
					String lang = request.getHeader("lang");
					if (lang != null) {
//						userDetails.getVo().getBasic()
//								.setUserLang((short) FieldConstants.USER_MAIN_LANG.valueOf(lang).ordinal());
					}
				} catch (Exception e) {
					handleErrorRes(1102, Application.DEFAULT_LANG, response);
					return;
				}
				// For simple validation it is completely sufficient to just
				// check the token integrity. You don't have to call
				// the database compellingly. Again it's up to you ;)
				if (jwtTokenUtil.validateToken(authToken, userDetails)) {
					RegiAuthenticationToken authentication = new RegiAuthenticationToken(userDetails.getVo(), authToken,
							userDetails.getAuthorities());
					authentication.setDetails(userDetails);
					logger.debug("authenticated user " + username + " with authority " + userDetails.getAuthorities()
							+ ", setting security context");
					SecurityContextHolder.getContext().setAuthentication(authentication);
				}
			}
		}
		String logStr = "";
		if (request.getRequestURI().equals("/common/upload")) {
			// file upload request, don't print out stream content
			chain.doFilter(request, response);
			logStr = getLogString(request, username, "", response.getContentType(), "");
		} else {
			RequestWrapper rw = new RequestWrapper(request);
			TeeWrapper tw = new TeeWrapper(response);
			chain.doFilter(rw, tw);
			String requestStr = new String(rw.toByteArray(), "UTF-8");
			String responseStr = new String(tw.toByteArray(), "UTF-8");
			logStr = getLogString(rw, username, requestStr, tw.getContentType(), responseStr);
		}
		logger.info(logStr);
		sendMessage(logStr);
	}

	String getLogString(HttpServletRequest request, String username, String requestStr, String responseContentType,
			String responseStr) {
		String referer = request.getHeader("Referer");
		String xForwardedFor = request.getHeader("X-Forwarded-For");
		String userAgent = request.getHeader("User-Agent");
		String terminalType = request.getHeader("terminalType");
		String remote = request.getRemoteAddr() + ":" + request.getRemoteHost();
		String authToken = request.getHeader(KeyDef.tokenHeader);
		StringBuilder sb = new StringBuilder();
		sb.append("\nauthToken:");
		sb.append(authToken);
		sb.append("\nRequest:");
		sb.append(request.getRequestURI());
		sb.append("\nReferer:");
		sb.append(referer);
		sb.append("\nUser-Agent:");
		sb.append(userAgent);
		sb.append("\nX-Forwarded-For:");
		sb.append(xForwardedFor);
		sb.append("\nremote:");
		sb.append(remote);
		sb.append("\nterminalType:");
		sb.append(terminalType);
		sb.append("\nuser:");
		sb.append(username);
		sb.append("\nRequest ContentType:");
		sb.append(request.getContentType());
		sb.append("\n\t");
		sb.append(requestStr);
		sb.append("\n");
		sb.append("\nResponse ContentType:");
		sb.append(responseContentType);
		if (responseContentType != null && responseContentType.startsWith("application/json")) {
			sb.append("Response:\n\t" + responseStr);
		}
		return sb.toString();
	}

	public class RequestWrapper extends HttpServletRequestWrapper {

		private final ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);

		public RequestWrapper(HttpServletRequest request) {
			super(request);
		}

		@Override
		public ServletInputStream getInputStream() throws IOException {
			return new ServletInputStream() {
				@Override
				public boolean isFinished() {
					return false;
				}

				@Override
				public boolean isReady() {
					return false;
				}

				@Override
				public void setReadListener(ReadListener readListener) {

				}

				private TeeInputStream tee = new TeeInputStream(RequestWrapper.super.getInputStream(), bos);

				@Override
				public int read() throws IOException {
					return tee.read();
				}
			};
		}

		public byte[] toByteArray() {
			return bos.toByteArray();
		}
	}

	static class TeeWrapper extends HttpServletResponseWrapper {

		private final ByteArrayOutputStream bos = new ByteArrayOutputStream(16384);
		private PrintWriter writer = new PrintWriter(bos);

		public TeeWrapper(HttpServletResponse response) {
			super(response);
		}

		@Override
		public ServletResponse getResponse() {
			return this;
		}

		@Override
		public ServletOutputStream getOutputStream() throws IOException {
			return new ServletOutputStream() {
				@Override
				public boolean isReady() {
					return false;
				}

				@Override
				public void setWriteListener(WriteListener writeListener) {

				}

				private TeeOutputStream tee = new TeeOutputStream(TeeWrapper.super.getOutputStream(), bos);

				@Override
				public void write(int b) throws IOException {
					tee.write(b);
				}
			};
		}

		@Override
		public PrintWriter getWriter() throws IOException {
			return new TeePrintWriter(super.getWriter(), writer);
		}

		public byte[] toByteArray() {
			return bos.toByteArray();
		}

	}

	static class TeePrintWriter extends PrintWriter {

		PrintWriter branch;

		public TeePrintWriter(PrintWriter main, PrintWriter branch) {
			super(main, true);
			this.branch = branch;
		}

		public void write(char buf[], int off, int len) {
			super.write(buf, off, len);
			super.flush();
			branch.write(buf, off, len);
			branch.flush();
		}

		public void write(String s, int off, int len) {
			super.write(s, off, len);
			super.flush();
			branch.write(s, off, len);
			branch.flush();
		}

		public void write(int c) {
			super.write(c);
			super.flush();
			branch.write(c);
			branch.flush();
		}

		public void flush() {
			super.flush();
			branch.flush();
		}
	}
}