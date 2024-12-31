package ControlFlow.Recursion;

import java.util.Scanner;

public class Q10 {
    //Write a Java recursive method to find the length of a given string.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Length of the string is " + length(str));
    }
    public static int length(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }

}
