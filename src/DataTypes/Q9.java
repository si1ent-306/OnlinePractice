package DataTypes;

import java.util.Scanner;

public class Q9 {
    // Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers),
    // the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println((num1 + num2) / 2);
        System.out.println(Math.max(num2, num1));
        System.out.println(Math.min(num1, num2));
    }
}
