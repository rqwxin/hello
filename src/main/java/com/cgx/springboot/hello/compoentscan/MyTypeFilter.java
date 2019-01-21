package com.cgx.springboot.hello.compoentscan;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**********
 * @program: spring-annotation-test
 * @description: 自定义扫描包规则
 * @author: cgx
 * @create: 2018-12-30 17:23
 **/
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
     //  * @param metadataReader the metadata reader for the target class 当前类元数据的提供者
	 //* @param metadataReaderFactory a factory for obtaining metadata readers for other classes (such as superclasses and interfaces) 获取其它类类元数据提供者
        //当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //当前类的类class信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        System.out.println("过滤器扫描到的类名--》"+classMetadata.getClassName());

        if (classMetadata.getClassName().endsWith("Service")){
            return false;
        }

        return true;
    }
}
