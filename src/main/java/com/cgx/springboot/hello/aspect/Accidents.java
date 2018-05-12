package com.cgx.springboot.hello.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Accidents {
    /*************
     * 定义切点，即是要拦截的类或方法
     */
    @Pointcut(value = "execution(* com.cgx.springboot.hello.aspect.Performance.perform(..))")
    public void perform(){

    }

    /*****************
     * 调用Pointcut 里的切点方法时，先调用@Before 的方法
     */
    @Before("perform()")
    public void silencePhone(){
        System.out.println("前置通知：silencePhone");
    }
    /*****************
     * 调用Pointcut 里的切点方法时，先调用@Before 的方法
     */
    @Before("perform()")
    public void takeSeats(){
        System.out.println("前置通知：takeSeats");
    }

    public void applause(){

    }
    /*****************
     * 调用Pointcut 里的切点方法完成后，会调用@After 的方法
     */
    @After("perform()")
    public void refund(){
        System.out.println("后置通知：refund");
    }
}
