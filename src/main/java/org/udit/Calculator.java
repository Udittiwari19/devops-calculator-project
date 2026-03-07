package org.udit;

public class Calculator {

    public double add(double a, double b) {
        return a + ;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        if (a < 0)
            throw new IllegalArgumentException("Negative square root");
        return Math.sqrt(a);
    }

    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative factorial");

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double ln(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("Invalid log input");
        return Math.log(a);
    }
}