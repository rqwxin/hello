package com.cgx.springboot.hello.importAnnotation;

import com.cgx.springboot.hello.bean.Person;
import com.cgx.springboot.hello.compoentscan.MyTypeFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**********
 * @program: spring-annotation-test
 * @description: 测试import
 * @author: cgx
 * @create: 2018-12-30 16:39
 **/
@Configuration
@ComponentScan(value = "com.cgx.springboot.hello.bean")
@Import(MyImportSelector.class)
public class ImportConfig {


}
