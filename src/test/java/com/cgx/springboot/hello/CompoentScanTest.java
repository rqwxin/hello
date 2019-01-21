package com.cgx.springboot.hello;

import com.cgx.springboot.hello.config.CompoentScanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 16:43
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompoentScanConfig.class)
public class CompoentScanTest {
    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void testScan(){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String na :
                names) {
            System.out.println(na);
        }
    }
}
