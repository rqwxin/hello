package com.cgx.springboot.hello.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**********
 * @program: hello
 * @description: 前后通知
 * @author: cgx
 * @create: 2018-12-02 16:25
 **/
public class AopAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object proceed = methodInvocation.proceed();
        after();
        return proceed;
    }

    private void after() {
        System.out.println("after");
    }


    private void before() {
        System.out.println("before");
    }


}
