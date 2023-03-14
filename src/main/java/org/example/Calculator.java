package org.example;

import java.util.*;





public class Calculator {
    public double factorial(double num)
    {
        double ans=1;
        for (int i=1;i<=num;i++)
            ans*=i;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    // do factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    System.out.println("\n");

            }
        } while (true);
    }
}
