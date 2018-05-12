package com.cgx.springboot.hello.services;

import org.springframework.stereotype.Service;

/**************
 *
 */
@Service
public class HelloService {

    public  String saySomething(String thing){
        return "hello，i want to say:"+thing;
    }
}
