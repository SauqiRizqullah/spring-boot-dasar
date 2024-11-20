package com.example.spring;

import com.example.spring.data.Bar;
import com.example.spring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Bean
    @DependsOn(value = "bar")
    @Lazy
    public Foo foo(){
        log.info("Foo has been created");
        return new Foo();}

    @Bean
    public Bar bar(){
        log.info("Bar has been created");
        return new Bar();}
}
