package ControlFlow.Recursion;

import java.util.Scanner;

public class Q2 {
    //Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The sum of all numbers from 1 to " + n + " is " + sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
