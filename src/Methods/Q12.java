package Methods;

import java.util.Scanner;

/**
 * Q12: Write a Java method (takes n as input) to display an n-by-n matrix.
 * @author chris
 */
public class Q12 {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Call the method to display the matrix
        System.out.println(matrix(n));
        // Close the Scanner object
        input.close();
    }

    /**
     * Method to display an n-by-n matrix.
     * @param n the size of the matrix
     * @return a string representation of the matrix
     */
    public static String matrix(int n) {
        // Create an n-by-n matrix of random 0s and 1s
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Generate a random 0 or 1
                matrix[i][j] = (int) (2 * Math.random());
            }
        }
        // Build a string representation of the matrix
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Append the value of each element to the result string
                result += matrix[i][j] + " ";
            }
            // Append a newline after each row
            result += "\n";
        }
        return result;
    }
}