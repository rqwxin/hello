package com.cgx.springboot.hello.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class IntroductionAspect {

    //增加引入
        @DeclareParents(value = "com.cgx.springboot.hello.aspect.Performance+",
    defaultImpl = AdvertServiceImlp.class)
    public AdvertService advert;
}
