package com.example.aopbaby.monitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class ServiceMonitor {

    @Around("execution(* com.example.aopbaby..HelloService.*(..))")
    public String logServiceAccess(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before...");
        String result = (String) pjp.proceed();
        System.out.println("After...");
        return result;
    }
}
