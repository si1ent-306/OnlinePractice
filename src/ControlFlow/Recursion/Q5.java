package ControlFlow.Recursion;

import java.util.Scanner;

public class Q5 {
    //Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
    /**
     * The main method reads the base and exponent values from the user input,
     * and then calls the power method to calculate the result.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = input.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = input.nextInt();
        System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
    }
}
