package com.example.spring;

import com.example.spring.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testBeanFactory(){
        ObjectProvider<Foo> fooObjectProvider = context.getBeanProvider(Foo.class); // satu tipe bean (Foo)
        List<Foo> fooList = fooObjectProvider.stream().collect(Collectors.toList());

        System.out.println(fooList);

        Map<String, Foo> beansOfType = context.getBeansOfType(Foo.class);
        System.out.println(beansOfType);
    }
}
