package com.example.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {
        "com.example.spring.service"
}
)
@Configuration
public class ComponentConfiguration {
}
