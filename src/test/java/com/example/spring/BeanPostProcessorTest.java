package com.example.spring;

import com.example.spring.data.Car;
import com.example.spring.processor.IdGeneratorBeanPostProcessor;
import com.example.spring.processor.PrefixIdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class BeanPostProcessorTest {

    @Configuration
    @Import({
            Car.class,
            IdGeneratorBeanPostProcessor.class,
            PrefixIdGeneratorBeanPostProcessor.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testIdAware(){
        Car bean = context.getBean(Car.class);
        Assertions.assertNotNull(bean.getId());

        System.out.println(bean.getId());
    }

}
