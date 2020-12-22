package com.primer.common.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author gcb
 */
@Aspect
@Component
public class InitializeAop {

    @Pointcut("execution(* com.primer.gui.uicomponents..*.test(..))")
    public void afterInitialize(){

    }

    @Around("afterInitialize()")
    public Object autoAppConfig(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature());
        return joinPoint.proceed();
    }
}
