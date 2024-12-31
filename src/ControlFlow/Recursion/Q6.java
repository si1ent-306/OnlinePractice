package ControlFlow.Recursion;

import java.util.Scanner;

public class Q6 {
    //Write a Java recursive method to reverse a given string.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Reversed string: " + reverse(str));
    }

    /**
     * Reverses a given string using recursion.
     *
     * @param str The string to reverse.
     * @return The reversed string.
     */
    public static String reverse(String str) {
        // Base case, if the string has only one character, return it.
        if (str.length() == 1) {
            return str;
        }
        // Recursive case, reverse the substring from the second character to the end,
        // and append the first character.
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
