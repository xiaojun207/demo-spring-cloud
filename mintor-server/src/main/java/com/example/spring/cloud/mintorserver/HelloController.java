package com.example.spring.cloud.mintorserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController("HelloController")
@RequestMapping("/Hello")
public class HelloController {

    @Value("${timeout}")
    private String timeout;
    @Value("${spring.datasource.password}")
    private String db_password;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get(HttpServletRequest request, HttpServletResponse response) {
        return "this is a get test timeout:"  + timeout + ", db_password:" + db_password;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post(HttpServletRequest request, HttpServletResponse response) {
        return "this is a set test";
    }

}
