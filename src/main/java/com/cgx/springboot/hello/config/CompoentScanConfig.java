package com.cgx.springboot.hello.config;

import com.cgx.springboot.hello.compoentscan.MyTypeFilter;
import com.cgx.springboot.hello.lifeCycle.Car;
import com.cgx.springboot.hello.lifeCycle.MyBeanPostProcesstor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**********
 * @program: spring-annotation-test
 * @description: 测试扫描包注解
 * @author: cgx
 * @create: 2018-12-30 16:39
 **/
@Configuration
@ComponentScan(value = "com.cgx.springboot.hello.bean",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION ,classes = {Controller.class})
        },
        includeFilters = {
               /* @ComponentScan.Filter(type = FilterType.ANNOTATION ,classes = {Component.class}),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE ,classes = {Car.class}),*/
                @ComponentScan.Filter(type = FilterType.CUSTOM ,classes = {MyTypeFilter.class})
        },
        useDefaultFilters = false
)
//value : 指定扫描路径的包
//excludeFilters : 扫描时，按照设置的规则过滤组件。
    //Filter( FilterType.ANNOTATION 按注解过滤，classes 设置按哪些注解类过滤)
//includeFilters:  扫描时，按照设置规则包含组件。

 //FilterType.ANNOTATION 按照注解
//FilterType.ASSIGNABLE_TYPE 按照类型
//FilterType.CUSTOM  自定义规则
public class CompoentScanConfig {

}
