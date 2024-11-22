package com.example.spring;

import com.example.spring.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PaymentGatewayClientFactoryBean.class)
public class FactoryConfiguration {
}
