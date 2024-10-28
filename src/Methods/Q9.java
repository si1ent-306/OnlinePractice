package Methods;

import java.util.Scanner;

/**
 * Q9: Write a Java method to print characters between two characters (i.e. A to P).
 */
public class Q9 {
    public static void main(String[] args) {
        // Prompt the user to enter two characters
        Scanner input = new Scanner(System.in);
        char c1 = input.next().charAt(0);
        char c2 = input.next().charAt(0);
        // Call the method to print the characters between c1 and c2
        charbetween(c1, c2);
    }

    /**
     * Prints the characters between two given characters (inclusive).
     * @param c1 the start character
     * @param c2 the end character
     */
    public static void charbetween(char c1, char c2) {
        for (char i = c1; i <= c2; i++) {
            System.out.print(i + " ");
        }
    }
}