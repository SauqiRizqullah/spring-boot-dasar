package com.example.spring.data;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    public void start(){
      log.info("Server dijalankan");
    }

    public void stop(){
        log.info("Server dihentikan");
    }

}
