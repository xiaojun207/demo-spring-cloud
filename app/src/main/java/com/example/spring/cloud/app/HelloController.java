package com.example.spring.cloud.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @Autowired
    HelloFeignService helloFeignService;

    @Value("${hello}")
    String hello;

    @RequestMapping("/test/1")
    public String Hello() {
        return "test:" + helloService.getHelloContent();
    }

    @RequestMapping("/test/2")
    public String Hello2() {
        return "test:" + helloFeignService.sayHello();
    }


    @RequestMapping("/api-feign/hello3")
    public String Hello3() {
        return hello;
    }

}
