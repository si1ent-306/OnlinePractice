package Methods;

import java.util.Scanner;

public class Q3 {
    //Write a Java method to display the middle character of a string.
    //Note: a) If the length of the string is odd there will be two middle characters.
    //b) If the length of the string is even there will be one middle character.
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Call the method to display the middle character
        middleCharacter(str);
        // Close the Scanner object
        sc.close();
    }
    public static void middleCharacter(String str) {
        // Check if the string is empty
        if (str.length() == 0) {
            System.out.println("The string is empty.");
            return;
        }
        // Calculate the length of the string
        int len = str.length();
        // Check if the length is odd or even
        if (len % 2 == 0) {
            // If the length is even, print the middle two characters
            System.out.println("The middle character is: " + str.charAt(len / 2 - 1) + str.charAt(len / 2));
        } else {
            // If the length is odd, print the middle character
            System.out.println("The middle character is: " + str.charAt(len / 2));
        }
    }
}
