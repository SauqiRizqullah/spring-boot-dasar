package com.example.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {
        "com.example.spring.service",
        "com.example.spring.repository",
        "com.example.spring.configuration"
}
)
@Configuration
public class ComponentConfiguration {
}
