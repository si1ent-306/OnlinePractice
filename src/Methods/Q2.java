package Methods;

import java.util.Scanner;

public class Q2 {
    // Write a Java method to compute the average of three numbers.
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Call the average method and display the result
        System.out.println("The average is: " + average(a, b, c));
    }

    // Method to compute the average of three numbers
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
