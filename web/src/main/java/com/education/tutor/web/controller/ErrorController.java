package com.education.tutor.web.controller;

import com.education.tutor.Application;
import com.education.tutor.api.ErrorRes;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.service.I18nService;
import com.education.tutor.vo.UserPrincipalVO;
import com.education.tutor.web.security.RegiAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/error")
public class ErrorController extends BasicErrorController {

	static final String contentType = "application/json";
	
	@Autowired
	I18nService i18nService;

	@Autowired
	private ServerProperties serverProperties;

	public ErrorController() {
		super(new DefaultErrorAttributes(), new ErrorProperties());
	}

	@RequestMapping(value = "404")
	public ErrorRes error404(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(200);
		response.setContentType(contentType);
		return processError(request);
	}

	@RequestMapping(value = "500")
	public ErrorRes error500(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(200);
		response.setContentType(contentType);
		return processError(request);
	}

	@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public ErrorRes error(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(200);
		response.setContentType(contentType);
		return processError(request);
	}

	public ErrorRes processError(HttpServletRequest request) {
		ErrorRes res = new ErrorRes();
		String lang = Application.DEFAULT_LANG;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			UserPrincipalVO user = ((RegiAuthenticationToken) auth).getUserPrincipal();
			lang = FieldConstants.USER_MAIN_LANG.values()[(int) user.getBasic().getUserLang()].name();
		}
		HttpStatus status = getStatus(request);		
		res.setHttpStatus(status.ordinal());
		res.setCode(104);
		res.setMessage(i18nService.getMessage("" + res.getCode(), lang));
		return res;
	}

	@Override
	public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
		ErrorRes res = processError(request);
		Map<String, Object> body = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
		// HttpStatus status = getStatus(request);
		body.put("code", res.getCode());
		body.put("message", res.getMessage());
		return new ResponseEntity<Map<String, Object>>(body, HttpStatus.OK);
	}

	@Override
	public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
		return super.errorHtml(request, response);
	}

	/**
	 * Determine if the stacktrace attribute should be included.
	 * 
	 * @param request
	 *            the source request
	 * @param produces
	 *            the media type produced (or {@code MediaType.ALL})
	 * @return if the stacktrace attribute should be included
	 */
	@Override
	protected boolean isIncludeStackTrace(HttpServletRequest request, MediaType produces) {
		ErrorProperties.IncludeStacktrace include = this.serverProperties.getError().getIncludeStacktrace();
		if (include == ErrorProperties.IncludeStacktrace.ALWAYS) {
			return true;
		}
		if (include == ErrorProperties.IncludeStacktrace.ON_TRACE_PARAM) {
			return getTraceParameter(request);
		}
		return false;
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
