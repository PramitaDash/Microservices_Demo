package com.Microservices_2.Microservice2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Microservices1")
public interface Client {

    @GetMapping("/message")
    public String getData();
}
