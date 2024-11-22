package com.example.spring;

import com.example.spring.repository.CustomerRepository;
import com.example.spring.service.CategoryService;
import com.example.spring.repository.ProductRepository;
import com.example.spring.repository.CategoryRepository;
import com.example.spring.service.CustomerService;
import com.example.spring.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent(){
        ProductService service1 = context.getBean(ProductService.class);
        ProductService service2 = context.getBean("productService",ProductService.class);

        Assertions.assertSame(service1,service2);
    }

    @Test
    void testConstructorDI(){
        ProductService service = context.getBean(ProductService.class);
        ProductRepository repository = context.getBean(ProductRepository.class);

        Assertions.assertSame(service.getProductRepository(),repository);


    }

    @Test
    void testSetterDI(){
        CategoryService categoryService = context.getBean(CategoryService.class);
        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }

    @Test
    void testFieldDI(){
        CustomerService customerService = context.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = context.getBean("normalCustomerRepository" , CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertSame(customerService.getNormalCustomerRepository(), normalCustomerRepository);
        Assertions.assertSame(customerService.getPremiumCustomerRepository(), premiumCustomerRepository);

    }

}
