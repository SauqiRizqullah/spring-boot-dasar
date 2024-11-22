package com.example.spring;

import com.example.spring.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {
        "com.example.spring.service",
        "com.example.spring.repository",
        "com.example.spring.configuration"
}
)
@Configuration
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
