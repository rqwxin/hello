package com.cgx.springboot.hello.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

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
    public void silencePhone(JoinPoint joinPoint){
        System.out.println("前置通知：silencePhone");
        Object[] args = joinPoint.getArgs();
        //调用方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("调用方法名："+name+"参数名："+Arrays.asList(args));
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
    @After(value = "perform()")
    public void refund(JoinPoint joinPoint){
        //调用方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("后置通知：refund,方法名:"+name);
    }

    /************
     * 调用Pointcut 里的切点方法完成后返回值
     * @param joinPoint
     */
    @AfterReturning(value = "perform()",returning = "result")
    public void refundResult(JoinPoint joinPoint,Object result){
        Object target = joinPoint.getTarget();
        System.out.println("后置通知：refund,返回结果:"+result);
    }
}
