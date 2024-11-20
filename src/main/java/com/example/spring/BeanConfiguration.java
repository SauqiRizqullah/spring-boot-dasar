package com.example.spring;

import com.example.spring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean // method ini akan diproses oleh IOC
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new Foo");
        return foo;
    }

}
