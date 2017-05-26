package com.project;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ProjectApplication {

	
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate primaryJdbcTemplate(
	        @Qualifier("dataSource") DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
