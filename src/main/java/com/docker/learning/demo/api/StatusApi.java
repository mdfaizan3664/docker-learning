package com.docker.learning.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApi {

    @GetMapping("/status")
    public String up() {
        return "Hello World!!";
    }

    @GetMapping("/login")
    public String login() {
        return "Login Successful !!";
    }
}
