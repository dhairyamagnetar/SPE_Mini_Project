package com.example;

// import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // Test for basic addition
    @Test
    public void testAddition() {
        double result = App.basicCalculator(5.0, 3.0, '+');
        assertEquals(8.0, result, "Addition test failed!");
    }

    // Test for basic subtraction
    @Test
    public void testSubtraction() {
        double result = App.basicCalculator(10.0, 4.0, '-');
        assertEquals(6.0, result, "Subtraction test failed!");
    }

    // Test for basic multiplication
    @Test
    public void testMultiplication() {
        double result = App.basicCalculator(5.0, 3.0, '*');
        assertEquals(15.0, result, "Multiplication test failed!");
    }

    // Test for division
    @Test
    public void testDivision() {
        double result = App.basicCalculator(9.0, 3.0, '/');
        assertEquals(3.0, result, "Division test failed!");
    }

    // Test for division by zero
    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            App.basicCalculator(9.0, 0.0, '/');
        });
        assertEquals("Error: Division by zero is undefined!", exception.getMessage());
    }

    // Test for factorial
    @Test
    public void testFactorial() {
        long result = App.factorial(5);
        assertEquals(120, result, "Factorial test failed!");
    }

    // Test for factorial of zero
    @Test
    public void testFactorialZero() {
        long result = App.factorial(0);
        assertEquals(1, result, "Factorial of zero test failed!");
    }

    // Test for square root
    @Test
    public void testSquareRoot() {
        double result = App.squareRoot(16.0);
        assertEquals(4.0, result, "Square root test failed!");
    }

    // Test for square root of negative number
    @Test
    public void testSquareRootNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.squareRoot(-4.0);
        });
        assertEquals("Error: Negative number cannot have a real square root!", exception.getMessage());
    }

    // Test for natural logarithm
    @Test
    public void testNaturalLogarithm() {
        double result = App.naturalLogarithm(2.718281828); // Approximation of e
        assertEquals(1.0, result, 0.000001, "Natural logarithm test failed!");
    }

    // Test for power function
    @Test
    public void testPowerFunction() {
        double result = App.powerFunction(2.0, 3.0);
        assertEquals(8.0, result, "Power function test failed!");
    }

    // Test for natural logarithm of zero or negative number
    @Test
    public void testNaturalLogarithmNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.naturalLogarithm(0.0);
        });
        assertEquals("Error: Natural logarithm is undefined for non-positive numbers!", exception.getMessage());
    }
}
