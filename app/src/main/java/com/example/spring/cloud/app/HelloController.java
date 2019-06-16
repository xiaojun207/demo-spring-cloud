package com.example.spring.cloud.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @Autowired
    HelloFeignService helloFeignService;

    @RequestMapping("/hello")
    public String Hello() {
        return helloService.getHelloContent();
    }

    @RequestMapping("/hello2")
    public String Hello2() {
        return helloFeignService.sayHello();
    }


    @RequestMapping("/api-feign/hello3")
    public String Hello3() {
        return "hello3";
    }

}
