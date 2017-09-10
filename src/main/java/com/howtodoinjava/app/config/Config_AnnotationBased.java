package com.howtodoinjava.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.howtodoinjava.app.aspect.LoggingAspect_AnnotationBased;
import com.howtodoinjava.app.service.EmployeeManager;
import com.howtodoinjava.app.service.impl.EmployeeManagerImpl;

@Configuration
@EnableAspectJAutoProxy
public class Config_AnnotationBased {
	@Bean
	public LoggingAspect_AnnotationBased loggingAspect() {
		return new LoggingAspect_AnnotationBased();
	}
	@Bean
	public EmployeeManager employeeManager() {
		return new EmployeeManagerImpl();
	}
}
