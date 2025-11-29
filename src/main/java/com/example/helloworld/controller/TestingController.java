package com.example.helloworld.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
@AllArgsConstructor
public class TestingController {

        @GetMapping
        public String health() {
            return " Testing Hello Everyone, Hiiii welcome to jenkins testing. I'm Healthy";
        }
    }


