package com.unittesting.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    int Sum(int a, int b){
        return a+b;
    }
}
