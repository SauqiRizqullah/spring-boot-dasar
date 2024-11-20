package com.example.spring;

import com.example.spring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicationConfigurationTest {
    @Test
    void testDuplicate(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicationConfiguration.class);


        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () ->{
            Foo bean = context.getBean(Foo.class);
        });
//        Foo bean = context.getBean(Foo.class);
    }

    @Test
    void testGetBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicationConfiguration.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2); //beannya berbeda
    }

}
