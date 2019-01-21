package com.cgx.springboot.hello.config;

import com.cgx.springboot.hello.aspect.AdvertService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Configuration;

/**********
 * @program: hello
 * @description:
 * @author: cgx
 * @create: 2018-12-02 14:21
 **/
//@Configuration
public class Aopconfig {

    protected ProxyFactoryBean getProxyFactoryBean(){
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        //需要代理的接口
        proxyFactoryBean.setInterfaces(AdvertService.class);
        //拦截器名称(也就是增强类名称)
        proxyFactoryBean.setInterceptorNames("aopAroundAdvice");
        proxyFactoryBean.setTargetName("advertServiceImpl");
        return proxyFactoryBean;
    }

    /***********
     * 自动生成代理
     */
    public void getBeanNameAutoProxy(){
        BeanNameAutoProxyCreator bn = new BeanNameAutoProxyCreator();
        //后缀名imlp的bean 自动代理
        bn.setBeanNames("*Impl");
        //拦截类名称(增强类，切面)
        bn.setInterceptorNames("aopAroundAdvice");

    }
}
