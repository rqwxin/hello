package com.cgx.springboot.hello.aop;


import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**********
 * @program: hello
 * @description:
 * @author: cgx
 * @create: 2018-12-01 13:55
 **/
public class CGlibProxy implements MethodInterceptor {
    private static CGlibProxy cGlibProxy = new CGlibProxy();

    public static CGlibProxy getInstance(){
        return  cGlibProxy;
    }
    public <T> T getProxy(Class<T> cla){
        //
        return (T) Enhancer.create(cla,this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before ");
    }

    public static void main(String[] args) {
        Hello proxy = CGlibProxy.getInstance().getProxy(Hello.class);
        proxy.say("奇偶e");
    }
}

class Hello {
    void say(String name){
        System.out.println("hello "+ name);
    }
}

