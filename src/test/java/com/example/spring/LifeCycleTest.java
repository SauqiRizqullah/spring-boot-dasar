package com.example.spring;

import com.example.spring.data.Connection;
import com.example.spring.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown(){
        context.close();
    }

    @Test
    void testConnection(){
        Connection connection = context.getBean(Connection.class);
    }

    @Test
    void testServer(){
        Server server = context.getBean(Server.class);
    }


}
