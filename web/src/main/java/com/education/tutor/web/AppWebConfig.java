package com.education.tutor.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppWebConfig {

	@Autowired
	EventSourcingLoggerFilter requestLoggingFilter;

	@Bean
	public FilterRegistrationBean loggingFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		requestLoggingFilter.setIncludeClientInfo(true);
		requestLoggingFilter.setIncludeHeaders(true);
		requestLoggingFilter.setIncludeQueryString(true);
		requestLoggingFilter.setIncludePayload(true);
		// requestLoggingFilter.setMaxPayloadLength(8192);
		registration.setFilter(requestLoggingFilter);
		registration.addUrlPatterns("/topic/*", "/login/*", "/common/*", "/user/*", "/task/*", "/workcircle/*",
				"/friendship/*", "/group/*","/transit/*","/boss/*");
		return registration;
	}

}
