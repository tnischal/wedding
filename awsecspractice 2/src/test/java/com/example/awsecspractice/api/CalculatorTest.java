package com.example.awsecspractice.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSum(){
        int sum = calculator.sum(5,5);
        assertEquals(10, sum,  "5+5 is equals to 10");

    }


}
