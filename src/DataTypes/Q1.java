package DataTypes;

import java.util.Scanner;

public class Q1 {
    //Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(c);
    }
}
