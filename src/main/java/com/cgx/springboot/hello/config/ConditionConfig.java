package com.cgx.springboot.hello.config;

import com.cgx.springboot.hello.bean.Person;
import com.cgx.springboot.hello.condition.LinuxCondition;
import com.cgx.springboot.hello.condition.WindowCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 18:51
 **/
@Configuration
@ComponentScan("com.cgx.springboot.hello.bean")
public class ConditionConfig {

    @Bean("bill")
    @Conditional(WindowCondition.class)
   Person person1(){
      return  new Person("比尔.盖次");
  }
    @Bean("linus")
    @Conditional(LinuxCondition.class)
     Person person2(){
        return  new Person("Linus");
    }
}
