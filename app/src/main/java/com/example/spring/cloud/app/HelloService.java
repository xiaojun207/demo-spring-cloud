package com.example.spring.cloud.app;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent() {
        return "restTemplate.respone: " + restTemplate.getForObject("http://CLIENT-SERVICE/hello",String.class);
    }

    public String serviceFailure() {
        return "hello world service is not available !";
    }

}
