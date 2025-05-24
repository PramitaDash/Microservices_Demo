package com.Microservice_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/message")
    public String getMessage(){
        return "From mincroservices -1";
    }
}
