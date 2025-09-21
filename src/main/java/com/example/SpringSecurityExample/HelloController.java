package com.example.SpringSecurityExample;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request)
    {
        return "Welcome to my app" + request.getSession().getId();
    }
}
