package com.education.tutor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.ServletContextRequestLoggingFilter;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@MapperScan("com.education.tutor.db.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public final static String DEFAULT_LANG = "en";

	@Bean
	@ConditionalOnMissingBean(CharacterEncodingFilter.class)
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceRequestEncoding(true);
		filter.setForceResponseEncoding(true);
		return filter;
	}

	@Bean
	public ServletContextRequestLoggingFilter requestLoggingFilter() {
		// EventSourcingLoggerFilter loggingFilter = new
		// EventSourcingLoggerFilter();
		ServletContextRequestLoggingFilter loggingFilter = new ServletContextRequestLoggingFilter();
		return loggingFilter;
	}

}
