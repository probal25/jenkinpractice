package com.porbal.webdeploytest.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/new")
    public String newDeploy() {
        return "Deploy Change added by Razib";
    }

    @GetMapping("/test")
    public String test() { return "Test added" ;}
    
    @GetMapping("/lol")
    public String testLol() { return "Lol added razib" ;}
}
