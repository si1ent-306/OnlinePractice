package Methods;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a password
        System.out.println("Enter a password to check if it's valid:");
        String password = input.nextLine();
        
        // Call the isValidPassword method and display the result
        System.out.println("Is the password valid? " + isValidPassword(password));
    }

    /**
     * Method to check whether a string is a valid password.
     * 
     * Password rules:
     * - A password must have at least ten characters.
     * - A password consists of only letters and digits.
     * - A password must contain at least two digits.
     * 
     * @param password The password string to be validated
     * @return true if the password is valid, false otherwise
     */
    public static boolean isValidPassword(String password) {
        // Check for minimum length
        if (password.length() < 10) {
            return false;
        }
        
        boolean hasDigit = false;
        boolean hasLetter = false;
        int digitCount = 0;
        
        // Iterate through each character in the password
        for (char c : password.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                hasDigit = true;
                digitCount++;
            } 
            // Check if the character is a letter
            else if (Character.isLetter(c)) {
                hasLetter = true;
            } 
            // If the character is neither a letter nor a digit, return false
            else {
                return false;
            }
        }
        
        // Return true if the password has at least two digits and contains letters
        return hasDigit && hasLetter && digitCount >= 2;
    }
}