package com.porbal.webdeploytest.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "hello from branch feature/dashboard_v_0_1 again";
    }

    @GetMapping("/new")
    public String newDeploy() {
        return "Deploy Change added by Sakib";
    }

    @GetMapping("/test")
    public String test() { return "Test added" ;}
    
    @GetMapping("/lol")
    public String testLol() { return "Lol added" ;}

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Dashboard added in Feature_Dash_V1 branch";
    }

    @GetMapping("/dash")
    public String noDash() {return "not updated";}
}
