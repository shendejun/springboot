package com.example.demo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportSelector 方法返回值，必须必须是一个class全称，改class会被spring容器所托管起来
 */
public class MyImportSelector  implements ImportSelector{

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.example.demo.User",Role.class.getName(),MyConfiguration.class.getName()};
    }
}
