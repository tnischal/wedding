package com.unittesting.demo.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {



    @Test
    public void testSum(){

        Calculator calculator = new Calculator();

        int actualSum = calculator.Sum(2,3);
        int desiredSum = 5;
        assertEquals(actualSum,desiredSum);
    }

    @Test
    public void testSum1(){

        Calculator calculator = new Calculator();

        int actualSum = calculator.Sum(-2,-3);
        int desiredSum = -5;
        assertEquals(actualSum,desiredSum);
    }
}
