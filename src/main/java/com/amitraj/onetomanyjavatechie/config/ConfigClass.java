package com.amitraj.onetomanyjavatechie.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClass {

    @GetMapping("/message")
    public String getMessage(){
        return "utility class added";
    }
}
