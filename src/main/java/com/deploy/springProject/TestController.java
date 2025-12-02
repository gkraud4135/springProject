package com.deploy.springProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String index(){
        return "안뇽 🦛💕🐥";
    }

    @GetMapping("/test")
    public String test2(){
        return "Hello, world!";
    }
}
