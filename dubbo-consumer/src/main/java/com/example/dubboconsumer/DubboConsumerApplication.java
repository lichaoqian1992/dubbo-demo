package com.example.dubboconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

//    @Configuration
//    @EnableDubbo(scanBasePackages = "com.example.dubboconsumer.serviceimpl", multipleConfig = true)
//    static class ConsumerConfiguration {
//    }
}
