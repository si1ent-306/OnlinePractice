package ControlFlow.Recursion;

import java.util.Scanner;

public class Q3 {
    //Write a Java recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
    }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The " + n + "th Fibonacci number is " + fibonacci(n));
    }
}
