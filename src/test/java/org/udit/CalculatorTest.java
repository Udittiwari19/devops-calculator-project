package org.udit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(11.0, calc.add(6, 5), 0.0001);
        assertEquals(-1.0, calc.add(-2, 1), 0.0001);
        assertEquals(0.0, calc.add(0, 0), 0.0001);
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(3, 2), 0.0001);
        assertEquals(-3.0, calc.subtract(-2, 1), 0.0001);
        assertEquals(0.0, calc.subtract(0, 0), 0.0001);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2, 3), 0.0001);
        assertEquals(-2.0, calc.multiply(-2, 1), 0.0001);
        assertEquals(0.0, calc.multiply(0, 3), 0.0001);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6, 3), 0.0001);
        assertEquals(-2.0, calc.divide(-6, 3), 0.0001);
        assertThrows(ArithmeticException.class, () ->
                calc.divide(1, 0)
        );
    }

    @Test
    void testPower() {
        assertEquals(8.0, calc.power(2, 3), 0.0001);
        assertEquals(1.0, calc.power(2, 0), 0.0001);
        assertEquals(0.25, calc.power(2, -2), 0.0001);
    }

    @Test
    void testSquareRoot() {
        assertEquals(4.0, calc.sqrt(16), 0.0001);
        assertEquals(0.0, calc.sqrt(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () ->
                calc.sqrt(-1)
        );
    }

    @Test
    void testLogarithm() {
        assertEquals(Math.log(2), calc.ln(2), 0.0001);
        assertEquals(0.0, calc.ln(1), 0.0001);
        assertThrows(IllegalArgumentException.class, () ->
                calc.ln(0)
        );
    }

    @Test
    void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));
        assertEquals(1, calc.factorial(1));
        assertThrows(IllegalArgumentException.class, () ->
                calc.factorial(-5)
        );
    }
}
