package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorTest {

    Double precision;

    @Before
    public void setUp() throws Exception {
        precision = 0.00001;
    }

    @Test
    public void add() {

        // Setup
        Double op1 = 5d;
        Double op2 = 7d;
        Double expected = 12d;

        // Execute
        Double actual = BasicCalculator.add(op1, op2);

        // Assert
        assertEquals(expected, actual, precision);

        // Teardown
    }

    @Test
    public void subtract() {

        // TODO implement test
    }

    @Test
    public void multiply() {

        // TODO implement test
    }

    @Test
    public void divide() {

        // TODO implement test
    }

    @Test
    public void mod() {

        // TODO implement test
    }
}
