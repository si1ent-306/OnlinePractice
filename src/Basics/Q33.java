package Basics;

import java.util.Scanner;

public class Q33 {

    /**
     * Q33: Write a program to accept a number from the user and compute the sum of the digits of the number.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputNumber = scanner.next();
        int digitSum = 0;
        // loop through each character in the string and add it to the sum
        for (int i = 0; i < inputNumber.length(); i++) {
            digitSum += Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
            System.out.println("The sum of the digits is: " + digitSum);
        }
        System.out.println("The sum of the digits is: " + digitSum);
    }
}
