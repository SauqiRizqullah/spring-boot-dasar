package com.example.spring;

import com.example.spring.service.MerchantService;
import com.example.spring.service.impl.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testInheritance(){
        MerchantService merchantService = context.getBean(MerchantService.class);
        MerchantServiceImpl merchantService1 = context.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService, merchantService1);
    }
}
