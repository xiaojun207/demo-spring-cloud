package com.spring.cloud.usercenter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController("UserController")
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String get(HttpServletRequest request, HttpServletResponse response) {
        return "this is a get user info ";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post(HttpServletRequest request, HttpServletResponse response) {
        return "this is a set test";
    }

}
