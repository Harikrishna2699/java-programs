package Harikrishna;

import java.util.Scanner;

public class excephandling {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        try {
            // Get two numbers from the user
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Perform division and display the result
            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("error: division by zero is not allowed");
          //  System.out.println("Error pls enter valid integers");
        }finally {
            sc.close();
        }
    }
    private static int divide (int numerator, int denominator) {
        return numerator / denominator;
    }}