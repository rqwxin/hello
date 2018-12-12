package com.cgx.springboot.hello.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**********
 * @program: hello
 * @description: MethodBeforeAdvice 接口实现方法前的调用，
 * AfterReturningAdvice 接口实现方法后的调用
 * @author: cgx
 * @create: 2018-12-01 13:44
 **/
public class AopBeforeAfterAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(this.getClass().getName()+" say before");
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(this.getClass().getName()+" afterReturning");
    }

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        /**
         * 创建代理目标类
         */
        proxyFactory.setTarget(new AopTestImpl());
        //添加通知类
        proxyFactory.addAdvice(new AopBeforeAfterAdvice());
        //proxyFactory.addAdvice(new AopAroundAdvice());
        AopTestImpl proxy = (AopTestImpl) proxyFactory.getProxy();
        proxy.say("cglib ");
    }

}
class  AopTestImpl {
    void say(String name){
        System.out.println("aop say :"+name);
    }
}
