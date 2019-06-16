package com.example.spring.cloud.app;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFailure implements HelloFeignService{
    @Override
    public String sayHello() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
