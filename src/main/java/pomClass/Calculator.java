/**
* Author: Shreyas Bhagat
* Date: 1 Jun 2025
* Description: 
*/
package pomClass;
public class Calculator {
	public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
    
    public int modulus(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot mod by zero");
        return a % b;
    }

    public int square(int a) {
        return a * a;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double a) {
        if (a < 0) throw new ArithmeticException("Cannot take square root of negative number");
        return Math.sqrt(a);
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public boolean isOdd(int a) {
        return a % 2 != 0;
    }
}
