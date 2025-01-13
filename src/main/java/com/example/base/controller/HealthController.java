package com.example.base.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // フロントエンドのURLに応じて変更
public class HealthController {

    @GetMapping("/health")
    public String healthCheck() {
        System.out.println("health check is called");
        return "OK";
    }

    @GetMapping("/message1")
    public String getMessage() {
        return "hello2";
    }
}