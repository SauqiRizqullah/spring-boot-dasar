package com.example.spring.service;

import com.example.spring.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository") // qualifier digunakan untuk memilih bean secara manual
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
