package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        int result = calculatorService.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}
