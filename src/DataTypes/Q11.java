package DataTypes;

import java.util.Scanner;

public class Q11 {
    //Write a Java program to test whether a given double/float value is a finite floating-point value or not.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if (Double.isFinite(num)) {
            System.out.println("The number is a finite floating-point value.");
        } else {
            System.out.println("The number is not a finite floating-point value.");
        }
    }
}
