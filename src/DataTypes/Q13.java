package DataTypes;

import java.util.Scanner;

public class Q13 {
    //Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend = input.nextInt();
        int divisor = input.nextInt();
        int floorDivision = dividend / divisor;
        int floorModulus = dividend % divisor;
        System.out.println(floorDivision);
        System.out.println(floorModulus);
    }
}
