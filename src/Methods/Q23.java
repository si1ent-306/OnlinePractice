package Methods;

import java.util.Scanner;

public class Q23 {
    //Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not.
    //Return true if each character in the string is a vowel, otherwise return false

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isVowels(input.nextLine()));
    }
    public static boolean isVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                return false;
            }
        }
        return true;
    }
}
