package com.example.spring.cloud.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "CLIENT-SERVICE", fallback = HelloServiceFailure.class)
public interface HelloFeignService {

    @RequestMapping("/hello")
    String sayHello();

}
