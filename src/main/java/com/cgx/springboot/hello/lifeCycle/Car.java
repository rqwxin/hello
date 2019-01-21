package com.cgx.springboot.hello.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-11 16:33
 **/
@Component
public class Car implements InitializingBean,DisposableBean {
    public Car() {
        System.out.println("car construtor........");
    }

    public  void init(){
        System.out.println("car init..........");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("car DisposableBean destroy..........");
    }

    public  void destroy1(){
        System.out.println("car destroy..........");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("car InitializingBean init..........");
    }

    /*******
     * 在bean创建完成并且属性赋值完成；来执行初始化方法
     */
    @PostConstruct
    public void postInit(){
        System.out.println("car @PostConstruct 在bean创建完成并且属性赋值完成；来执行初始化方法");
    }

    /**
     * @PreDestroy：在容器销毁bean之前通知我们进行清理工作
     */
    @PreDestroy
    public  void preDestroy(){
        System.out.println("car @PreDestroy：在容器销毁bean之前通知我们进行清理工作");
    }
}
