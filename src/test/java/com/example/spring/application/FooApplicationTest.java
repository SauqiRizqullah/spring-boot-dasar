package com.example.spring.application;

import com.example.spring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

    @Autowired
    Foo foo; //tidak di private agar bisa DI oleh SpringBootTest

    @Test
    void testFooApplication(){
        Assertions.assertNotNull(foo);
    }
}
