package com.cgx.springboot.hello.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public Accidents getAccidents(){
        return  new Accidents();
    }
    @Bean
    public Performance getPerformance(){
        return  new PerformanceImpl();
    }

    @Bean
    public IntroductionAspect getIntrodution(){
        return  new IntroductionAspect();
    }

    @Bean
    public AdvertService getAdvertService(){
        return  new AdvertServiceImlp();
    }
}
