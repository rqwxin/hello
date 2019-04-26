package com.cgx.springboot.hello;

import com.cgx.springboot.hello.aspect.AdvertService;
import com.cgx.springboot.hello.aspect.Performance;
import com.cgx.springboot.hello.config.AspectConfig;
import com.cgx.springboot.hello.config.AwareConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class AspectTest2 {



    @Test
    public void testPerform(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AspectConfig.class);
        Performance performance = applicationContext.getBean(Performance.class);
        String s = performance.perform("宝莲灯");
        System.out.println(s);
    }

}
