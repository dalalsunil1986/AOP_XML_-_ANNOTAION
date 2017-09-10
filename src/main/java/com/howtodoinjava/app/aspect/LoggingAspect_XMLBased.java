package com.howtodoinjava.app.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect_XMLBased {
    public void logBeforeAllMethods(JoinPoint jp) throws Throwable
    {
        System.out.println("****LoggingAspect.logBeforeAllMethods() " + jp.getSignature().getName());
    }
}
