package Methods;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        // Write a Java method to compute the future investment value at a given interest rate for a specified number of years.

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        futureValue(amount, rate, years);
    }
    public static void futureValue(double amount, double rate, int years) {
        for (int i = 1; i <= years; i++) {
            amount = amount * (rate / 100) + amount;
            System.out.println("Year " + i + ": " + amount);
        }
    }
}
