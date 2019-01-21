package com.cgx.springboot.hello.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**********
 * @program: spring-annotation-test
 * @description: 类加载条件
 * @author: cgx
 * @create: 2018-12-30 19:44
 **/
public class LinuxCondition implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  the condition context
     * @param metadata metadata of the {@link AnnotationMetadata class}
     *                 or {@link MethodMetadata method} being checked.
     * @return {@code true} if the condition matches and the component can be registered
     * or {@code false} to veto registration.
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //ioc使用beanfactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //  BeanDefinitionRegistry that will hold the bean definition should the condition match
        //bean 定义注册器
        BeanDefinitionRegistry registry = context.getRegistry();
        //当前环境信息
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if (property.contains("linux")){
            return  true;
        }
        return false;
    }
}
