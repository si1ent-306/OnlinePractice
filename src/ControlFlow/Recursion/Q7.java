package ControlFlow.Recursion;

import java.util.Scanner;

public class Q7 {
    //Write a Java recursive method to find the greatest common divisor (GCD) of two numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
    public static int gcd(int a, int b) {
        // Base case of recursion: if the second number is zero, the GCD is the first number
        if (b == 0) {
            return a;
        } else {
            // Recursive case: call gcd with the second number and the remainder of the first divided by the second
            return gcd(b, a % b);
        }
    }
}
