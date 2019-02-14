package com.cgx.springboot.hello;

import com.cgx.springboot.hello.compoentscan.CompoentScanConfig;
import com.cgx.springboot.hello.importAnnotation.ImportConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 16:43
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ImportConfig.class)
public class ImportConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String na :
                beanDefinitionNames) {
            System.out.println("---->"+na);
        }
    }
}
