package DataTypes;

import java.util.Scanner;

public class Q12 {
    //Write a Java program to compare two signed and unsigned numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int signed = Integer.compare(num1, num2);
        int unsigned = Integer.compareUnsigned(num1, num2);
        System.out.println(signed);
        System.out.println(unsigned);
    }
}
