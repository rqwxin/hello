package com.cgx.springboot.hello;

import com.cgx.springboot.hello.aspect.AspectConfig;
import com.cgx.springboot.hello.lifeCycle.Car;
import com.cgx.springboot.hello.lifeCycle.LifeCycleConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-11 16:39
 **/
public class LifeCycleTest {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        System.out.println("容器创建完成。。。");
     //   Car car = (Car) applicationContext.getBean("car");
        applicationContext.close();
    }
}
