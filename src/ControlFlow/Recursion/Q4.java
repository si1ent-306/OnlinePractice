package ControlFlow.Recursion;

import java.util.Scanner;

public class Q4 {
    //Write a Java recursive method to check if a given string is a palindrome
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(str + " is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
    }
    /**
     * Checks if a given string is a palindrome.
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
    }
}
