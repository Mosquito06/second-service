package com.example.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecondeServiceController
{
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to the the Second Service.";
    }
}
