package DataTypes;

import java.util.Scanner;

public class Q15 {
    //Write a Java program to get the next floating-point adjacent to positive and negative infinity from a given floating/double number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        System.out.println(Math.nextUp(num));
        System.out.println(Math.nextDown(num));
    }
}
