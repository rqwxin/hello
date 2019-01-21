package com.cgx.springboot.hello;

import com.cgx.springboot.hello.aspect.AdvertService;
import com.cgx.springboot.hello.config.AspectConfig;
import com.cgx.springboot.hello.aspect.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectConfig.class)
//@SpringBootTest(HelloApplication)
public class AspectTest {

    @Autowired
    private Performance performance;

    @Test
    public  void testPerformAvdert(){
        performance.highTide();
       AdvertService ad = (AdvertService)performance;
        ad.advertTime();
    }

    @Test
    public void testPerform(){
        String s = performance.perform("宝莲灯");
        System.out.println(s);
    }

}
