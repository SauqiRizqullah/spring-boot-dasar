package com.example.spring.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentGatewayClient { // pura - puranya ini class dari third party (tidak bisa diubah-ubah)
    private String endpoint;

    private String privateKey;

    private String publicKey;
}
