package com.cgx.springboot.hello.aspect;

public class AdvertServiceImlp implements AdvertService{
    @Override
    public  void advertTime(){
        System.out.println("广告时间到，下面就欣赏广告");
    }
}
