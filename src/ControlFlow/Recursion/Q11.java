package ControlFlow.Recursion;

import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        generatePermutations(s);
    }
    /**
     * Generates and prints all permutations of the given string.
     *
     * This method uses recursion to generate permutations by selecting each character
     * as the starting point and recursively generating permutations of the remaining characters.
     * The base case occurs when the string has only one character, at which point it is printed.
     *
     * @param s The string for which to generate permutations.
     */
    public static void generatePermutations(String s) {
        if (s.length() == 1) { // base case
            // if the string has only one character, print it
            System.out.println(s);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            // select the current character as the starting point
            String c = String.valueOf(s.charAt(i));
            // generate the remaining string by removing the selected character
            String remaining = s.substring(0, i) + s.substring(i + 1, s.length());
            // recursively generate permutations of the remaining string
            generatePermutations(remaining);
            // print the permutation by concatenating the starting point with the remaining string
            System.out.println(c + remaining);
        }
    }
}
