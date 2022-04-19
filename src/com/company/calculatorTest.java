package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    calculator calculator = new calculator();
    @Test
    void add() {
        assertEquals(calculator.add(10.0, 20.0), 30.0);
    }

    @Test
    void substract() {
        assertEquals(calculator.substract(20.0, 10.0), 10.0);
    }

    @Test
    void multiply() throws Exception {
        assertEquals(calculator.multiply(10.0, 10.0), 100.0);
    }

    @Test
    void divide() {
        assertEquals(calculator.divide(64.0, 8.0), 8.0);
    }
}