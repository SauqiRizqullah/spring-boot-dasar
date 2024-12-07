package com.example.spring.application;

import com.example.spring.data.Bar;
import com.example.spring.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo(Bar bar){
        return new Foo();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);
        Foo foo = context.getBean(Foo.class);
        System.out.println(foo);
    }
}
