package com.example.spring;

import com.example.spring.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    }

    @Test
    void testFactory(){
        PaymentGatewayClient client = context.getBean(PaymentGatewayClient.class);
        Assertions.assertSame("/home", client.getEndpoint());
        Assertions.assertSame("general", client.getPublicKey());
        Assertions.assertSame("secret", client.getPrivateKey());
    }
}
