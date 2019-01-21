package com.cgx.springboot.hello.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2018-12-30 14:48
 **/
public class AwareBean implements ApplicationContextAware,BeanNameAware,BeanFactoryAware,ServletContextAware {
    /**********
     * 实现ApplicationContextAware 的方法
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的applicationContext:"+ applicationContext);
    }

    /**********
     * 实现BeanNameAware 的方法
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("传入的BeanName："+name);

    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("传入的beanFactory："+beanFactory);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println("传入的："+servletContext);
    }
}
