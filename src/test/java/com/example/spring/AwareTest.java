package com.example.spring;

import com.example.spring.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

public class AwareTest {

    @Configuration
    @Import({
            AuthService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void awareTest(){
        AuthService authService = context.getBean(AuthService.class);

        Assertions.assertEquals("com.example.spring.service.AuthService", authService.getBeanName());
        System.out.println(authService.getBeanName());
        Assertions.assertNotNull(authService.getBeanName());
        System.out.println(authService.getApplicationContext());
    }
}
