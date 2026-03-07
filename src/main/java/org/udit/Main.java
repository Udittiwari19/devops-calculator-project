package org.udit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        do {
            System.out.println("\n===== Scientific Calculator =====");
	    System.out.println("0. Show Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Factorial");
            System.out.println("8. Natural Logarithm");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            try {
                switch (choice) {
	            case 0 -> {
		        continue;
	            }

                    case 1 -> {
                        System.out.print("Enter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        System.out.println("Result: " + calc.add(a, b));
                    }

                    case 2 -> {
                        System.out.print("Enter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        System.out.println("Result: " + calc.subtract(a, b));
                    }

                    case 3 -> {
                        System.out.print("Enter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        System.out.println("Result: " + calc.multiply(a, b));
                    }

                    case 4 -> {
                        System.out.print("Enter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        System.out.println("Result: " + calc.divide(a, b));
                    }

                    case 5 -> {
                        System.out.print("Enter base: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter exponent: ");
                        double b = sc.nextDouble();
                        System.out.println("Result: " + calc.power(a, b));
                    }

                    case 6 -> {
                        System.out.print("Enter number: ");
                        double a = sc.nextDouble();
                        System.out.println("Result: " + calc.sqrt(a));
                    }

                    case 7 -> {
                        System.out.print("Enter integer: ");
                        int n = sc.nextInt();
                        System.out.println("Result: " + calc.factorial(n));
                    }

                    case 8 -> {
                        System.out.print("Enter number: ");
                        double a = sc.nextDouble();
                        System.out.println("Result: " + calc.ln(a));
                    }

                    case 9 -> System.out.println("Exiting...");

                    default -> System.out.println("Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 9);
        sc.close();
    }
}
