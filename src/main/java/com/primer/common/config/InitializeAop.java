package com.primer.common.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author gcb
 */
public class InitializeAop {

    @Pointcut("execution(* com.primer.gui.uicomponents..*.test(..))")
    public void afterInitialize(){

    }

    //@After("afterInitialize()")
    public void autoAppConfig(JoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature());
    }
}
