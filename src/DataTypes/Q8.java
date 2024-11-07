package DataTypes;

import java.util.Scanner;

public class Q8 {
    //Write a Java program that reads a number and displays the square, cube, and fourth power.
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num * num);
        System.out.println(num * num * num);
        System.out.println(num * num * num * num);

    }
}
