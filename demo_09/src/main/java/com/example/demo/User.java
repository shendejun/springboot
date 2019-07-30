package com.example.demo;

import org.springframework.context.annotation.Import;

/**
 *
 */
@Import(MyImportSelector.class)
public @interface User {
    String name();
}
