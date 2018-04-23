package com.education.tutor.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Profile({ "uat", "dev", "spd" })
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	JwtAuthenticationEntryPoint unauthorizedHandler;

	@Autowired
	RegiAuthenticationProvider regiAuthenticationProvider;

	@Autowired
	RegiUserDetailService regiUserDetailService;
	
	@Autowired
	public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.authenticationProvider(regiAuthenticationProvider)
				.userDetailsService(regiUserDetailService).passwordEncoder(passwordEncoder());
		// authenticationManagerBuilder.userDetailsService(JdbcUserDetailsManager()).passwordEncoder(passwordEncoder());
	}

	// @Bean
	// public UserDetailsService JdbcUserDetailsManager() {
	// JdbcUserDetailsManager jdbcUserDetailService = new
	// JdbcUserDetailsManager();
	// jdbcUserDetailService.setDataSource(dataSource);
	// return jdbcUserDetailService;
	// }

	
	@Bean
	public PasswordEncoder passwordEncoder() {
		// $2a$10$qsYvMwvld7FMGKp45AQjpun6otC8b.eFN7Be5KAr0vuEQWgT.uvgm
		// 对应的密码是111
		return new BCryptPasswordEncoder();
	}

	@Bean
	public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
		return new JwtAuthenticationTokenFilter();
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity
				// we don't need CSRF because our token is invulnerable
				.csrf().disable().headers().frameOptions().disable().and().exceptionHandling()
				.authenticationEntryPoint(unauthorizedHandler).and()
				// don't create session
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
				// .anyRequest().authenticated()
				// .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				// allow anonymous resource requests
				.antMatchers(HttpMethod.GET, "/", "/**/*.html", "/**/*.css", "/**/*.js").permitAll()
				.antMatchers(HttpMethod.GET, "/webjars/**").permitAll()
				.antMatchers(HttpMethod.GET, "/swagger-resources/**").permitAll()
				.antMatchers(HttpMethod.GET, "/v2/api-docs").permitAll()
				.antMatchers(HttpMethod.POST, "/guest/**").permitAll()
				.antMatchers(HttpMethod.POST, "/login/**").permitAll()
				.antMatchers(HttpMethod.POST, "/transit/**").permitAll()
				.anyRequest().authenticated();
		// disable page caching
		httpSecurity.headers().cacheControl().disable();
				
		// Custom JWT based security filter
		httpSecurity.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
	}
	
}
