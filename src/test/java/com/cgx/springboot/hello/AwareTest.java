package com.cgx.springboot.hello;

import com.cgx.springboot.hello.aware.AwareBean;
import com.cgx.springboot.hello.config.AwareConfig;
import com.cgx.springboot.hello.config.LifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-11 16:39
 **/
public class AwareTest {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        System.out.println("容器创建完成。。。");
        AwareBean awareBean = applicationContext.getBean(AwareBean.class);
       // System.out.println(awareBean);
        applicationContext.close();
    }
}
