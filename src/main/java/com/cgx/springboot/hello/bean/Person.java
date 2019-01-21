package com.cgx.springboot.hello.bean;

import org.springframework.stereotype.Component;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 17:41
 **/
public class Person {
    String name;

    public Person(){

    }

    public Person(String  name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
