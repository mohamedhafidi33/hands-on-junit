package de.fh.aachen.isqm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8.0, calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15.0, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    public void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    public void testPower() {
        assertEquals(125.0, calculator.power(5, 3));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25));
    }

    @Test
    public void testSquareRootOfNegativeThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        });
        assertEquals("Cannot compute square root of a negative number.", exception.getMessage());
    }
}
