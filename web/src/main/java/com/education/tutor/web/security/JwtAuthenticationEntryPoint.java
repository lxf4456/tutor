package com.education.tutor.web.security;

import com.education.Application;
import com.education.tutor.api.BaseRes;
import com.education.tutor.service.I18nService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;


@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

	private static final long serialVersionUID = -8970718410437077606L;

	private final Log logger = LogFactory.getLog(this.getClass());

	ObjectMapper om = new ObjectMapper();

	@Autowired
	I18nService i18nService;

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		// This is invoked when user tries to access a secured REST resource
		// without supplying any credentials
		// We should just send a 401 Unauthorized response because there is no
		// 'login page' to redirect to
		logger.debug(request.getRequestURI());
		logger.info(authException);
		// 根据前端要求，不使用Http默认status code,一律使用200
		BaseRes res = new BaseRes();
		res.setCode(1100);
		String lang = request.getHeader("lang");
		if (lang == null) {
			lang = Application.DEFAULT_LANG;
		}
		res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
		String json = om.writeValueAsString(res);
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getOutputStream().write(json.getBytes());
		response.flushBuffer();
	}
}