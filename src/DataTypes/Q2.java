package DataTypes;

import java.util.Scanner;

public class Q2 {
    //Write a Java program that reads a number in inches and converts it to meters.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inch = input.nextDouble();
        System.out.println(inch * 0.0254);
    }
}
