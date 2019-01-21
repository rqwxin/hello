package com.cgx.springboot.hello.config;

import com.cgx.springboot.hello.aware.AwareBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 15:26
 **/
@Configuration
public class AwareConfig {
    @Bean
    AwareBean awareBean(){
        return new AwareBean();
    }
}
