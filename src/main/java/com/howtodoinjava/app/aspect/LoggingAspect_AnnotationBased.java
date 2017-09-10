package com.howtodoinjava.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LoggingAspect_AnnotationBased {
 
	@Pointcut("execution(* com.howtodoinjava.app.service.impl.EmployeeManagerImpl.*(..))")
	public void p(){
		
	}
	
	@Before("p()")
    public void logBeforeAllMethods(JoinPoint jp) throws Throwable
    {
        System.out.println("****LoggingAspect.logBeforeAllMethods() " + jp.getSignature().getName());
    }
}