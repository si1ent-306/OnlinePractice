package ControlFlow.Recursion;

import java.util.Scanner;

public class Q1 {
    //Write a Java recursive method to calculate the factorial of a given positive integer.
    public static int factorial(int n) {
        //Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        //multiply n by the factorial of (n-1), going all the way down until we reach the base case (0)
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
