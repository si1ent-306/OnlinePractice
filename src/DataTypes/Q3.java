package DataTypes;

import java.util.Scanner;

public class Q3 {
    // Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        char[] arr = Integer.toString(num).toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }

}
