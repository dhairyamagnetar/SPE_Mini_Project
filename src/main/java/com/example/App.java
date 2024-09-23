package com.example;
import java.util.Scanner;
import java.util.Scanner;

public class App{

    // Method for basic calculator operations
    public static double basicCalculator(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Error: Division by zero is undefined!");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator!");
        }
        return result;
    }

    // Method to calculate square root
    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            throw new IllegalArgumentException("Error: Negative number cannot have a real square root!");
        }
    }

    // Method to calculate factorial
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Error: Factorial of a negative number is undefined!");
        }
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate natural logarithm (ln)
    public static double naturalLogarithm(double num) {
        if (num > 0) {
            return Math.log(num);
        } else {
            throw new IllegalArgumentException("Error: Natural logarithm is undefined for non-positive numbers!");
        }
    }

    // Method to calculate power (x^b)
    public static double powerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Basic Calculator (Addition, Subtraction, Multiplication, Division)");
            System.out.println("2. Factorial");
            System.out.println("3. Square Root");
            System.out.println("4. Natural Logarithm (ln)");
            System.out.println("5. Power Function (x^b)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter operator (+, -, *, /): ");
                    char operator = scanner.next().charAt(0);
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + basicCalculator(num1, num2, operator));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int num = scanner.nextInt();
                    try {
                        System.out.println("Factorial: " + factorial(num));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter a number to find its square root: ");
                    double numSqrt = scanner.nextDouble();
                    try {
                        System.out.println("Square Root: " + squareRoot(numSqrt));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter a number to find its natural logarithm (ln): ");
                    double numLog = scanner.nextDouble();
                    try {
                        System.out.println("Natural Logarithm: " + naturalLogarithm(numLog));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + powerFunction(base, exponent));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
