package com.nacos.test.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class ProviderController {
    @GetMapping("/invoke")
    public String invoke() {
        return LocalTime.now() + " invoke";
    }
}
