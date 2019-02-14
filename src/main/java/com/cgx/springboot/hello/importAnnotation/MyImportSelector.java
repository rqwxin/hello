package com.cgx.springboot.hello.importAnnotation;

import com.cgx.springboot.hello.lifeCycle.Car;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**********
 * @program: spring-annotation-test
 * @description:
 * @author: cgx
 * @create: 2019-01-21 18:16
 **/
public class MyImportSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        importingClassMetadata.getClassName();
        return new String[]{"com.cgx.springboot.hello.lifeCycle.Car"};
    }
}
