package Assignment1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperations operations = new ArithmeticOperations();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
                continue;
            }

            if (choice == 6) {
                running = false;
                System.out.println("Exiting Calculator. Goodbye!");
                continue;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number. Enter again: ");
                scanner.next();
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number. Enter again: ");
                scanner.next();
            }
            double num2 = scanner.nextDouble();

            try {
                double result = 0;
                switch (choice) {
                    case 1:
                        result = operations.add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = operations.subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = operations.multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = operations.divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 5:
                        result = operations.modulus(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
