package com.example.spring;

import com.example.spring.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfiguration {
    @Primary
    @Bean // nama bean = foo1
    public Foo foo1(){return new Foo();}

    @Bean // nama bean = foo2
    public Foo foo2(){return new Foo();}
}
