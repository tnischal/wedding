package com.example.awsecspractice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<?> home(){
        return ResponseEntity.ok("Welcome from AWS ECS");
    }


}
