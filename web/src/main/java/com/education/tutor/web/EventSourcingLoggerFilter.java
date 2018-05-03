package com.education.tutor.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;

@Component
public class EventSourcingLoggerFilter extends AbstractRequestLoggingFilter {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void sendMessage(String message) {
	}

	@Override
	protected void afterRequest(HttpServletRequest arg0, String arg1) {
		sendMessage("after:" + arg1);
	}

	@Override
	protected void beforeRequest(HttpServletRequest arg0, String arg1) {
		sendMessage("before:" + arg1);
	}

}
