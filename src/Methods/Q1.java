package Methods;

import java.util.Scanner;

public class Q1 {
    // Write a Java method to find the smallest number among three numbers.
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter three numbers
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Call the min method and display the smallest number
        System.out.println("The smallest number is: " + min(a, b, c));
    }

    // Method to find the smallest of three numbers
    public static int min(int a, int b, int c) {
        int min = a; // Assume a is the smallest initially
        if (b < min) {
            min = b; // Update min if b is smaller
        }
        if (c < min) {
            min = c; // Update min if c is smaller
        }
        return min; // Return the smallest number
    }
}