/**
* Author: Shreyas Bhagat
* Date: 1 Jun 2025
* Description: 
*/
package TestClass;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import pomClass.Calculator;

public class Test_CalculatorApp {
	Calculator calc = new Calculator();
	@Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }

    @Test
    public void testModulus() {
        assertEquals(1, calc.modulus(7, 3));
    }

    @Test
    public void testModulusByZero() {
        assertThrows(ArithmeticException.class, () -> calc.modulus(7, 0));
    }

    @Test
    public void testSquare() {
        assertEquals(16, calc.square(4));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calc.power(2, 3));
    }

    @Test
    public void testSqrt() {
        assertEquals(5.0, calc.sqrt(25));
    }

    @Test
    public void testSqrtNegative() {
        assertThrows(ArithmeticException.class, () -> calc.sqrt(-1));
    }

    @Test
    public void testIsEven() {
        assertTrue(calc.isEven(4));
    }

    @Test
    public void testIsOdd() {
        assertTrue(calc.isOdd(7));
    }
}
