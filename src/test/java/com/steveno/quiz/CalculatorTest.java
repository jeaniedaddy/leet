package com.steveno.quiz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(c.add(3,4), 7); 

    }
}
