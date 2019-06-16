package com.example.spring.cloud.clientservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }
}
