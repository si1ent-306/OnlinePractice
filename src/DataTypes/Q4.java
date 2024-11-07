package DataTypes;

import java.util.Scanner;

public class Q4 {
    //Write a Java program to convert minutes into years and days.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
        //1440 minutes in a day
        int days = minutes / 1440;
        //365 days in a year
        int years = days / 365;
        //remaining days through %
        int remainingDays = days % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}
