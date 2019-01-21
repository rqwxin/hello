package com.cgx.springboot.hello;

import com.cgx.springboot.hello.bean.Person;
import com.cgx.springboot.hello.config.CompoentScanConfig;
import com.cgx.springboot.hello.config.ConditionConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 16:43
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionConfig.class)
public class ConditionTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test(){
        Environment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("当前系统-->"+property);
        //获取指定类型的beanName
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType ) {
            System.out.println("--->"+name);
        }
        //获取指定类型的所有bean
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        for (Map.Entry<String,Person> e :  beansOfType.entrySet()  ) {
            System.out.println("+++>"+e.getValue());
        }
    }
}
