package Methods;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the entered year is a leap year and print the result
        System.out.println(isLeapYear(year));
    }

    /**
     * Method to check whether a given year is a leap year.
     * A year is a leap year if it is divisible by 4 but not divisible by 100,
     * except if it is divisible by 400.
     *
     * @param year The year to be checked
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        // Check leap year conditions
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true; // Year is a leap year
        }
        return false; // Year is not a leap year
    }
}
