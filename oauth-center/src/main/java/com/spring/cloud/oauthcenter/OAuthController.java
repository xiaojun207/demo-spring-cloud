package com.spring.cloud.oauthcenter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RestController("OAuthController")
@RequestMapping("/auth")
public class OAuthController {

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String get1(HttpServletRequest request, HttpServletResponse response) {
        return "this is a get test";
    }


    @RequestMapping(value = "/2", method = RequestMethod.GET)
    public String get2(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("/auth/2");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "this is a get test";
    }


}
