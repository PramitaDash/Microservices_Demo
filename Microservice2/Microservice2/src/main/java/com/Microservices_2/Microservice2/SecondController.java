package com.Microservices_2.Microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @Autowired
    private Client client;

    @GetMapping("/fromSecondController")
    public String getMessageFromMicroservice1(){
        return client.getData();
    }
}
