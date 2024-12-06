package com.example.spring;

import com.example.spring.listener.LoginAgainSuccessListener;
import com.example.spring.listener.LoginSuccessListener;
import com.example.spring.listener.UserListener;
import com.example.spring.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {


    @Configuration
    @Import({UserService.class, LoginSuccessListener.class, LoginAgainSuccessListener.class, UserListener.class})
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testEventListener(){
        UserService userService = context.getBean(UserService.class);
        userService.login("eko","eko");
        userService.login("d","s");
    }
}
