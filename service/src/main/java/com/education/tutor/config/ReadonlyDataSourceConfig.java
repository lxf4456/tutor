package com.education.tutor.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = ReadonlyDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "readonlySqlSessionFactory")
public class ReadonlyDataSourceConfig {

	final static String PACKAGE = "com.education.tutor.db.readonly";
	
	@Bean(name = "readonlyDataSource")
	@Qualifier("readonlyDataSource")	
	@ConfigurationProperties(prefix = "spring.datasource.readonly")
	public DataSource readonlyDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "readonlyTransactionManager")	
	public DataSourceTransactionManager readonlyTransactionManager() {
		return new DataSourceTransactionManager(readonlyDataSource());
	}

	@Bean(name = "readonlySqlSessionFactory")	
	public SqlSessionFactory rdsSqlSessionFactory(@Qualifier("readonlyDataSource") DataSource readonlyDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(readonlyDataSource);
		return sessionFactory.getObject();
	}
}
