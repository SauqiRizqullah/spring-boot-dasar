package com.example.spring.configuration;

import com.example.spring.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }
}
