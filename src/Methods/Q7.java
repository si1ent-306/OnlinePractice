package Methods;

/**
 * Q7: Write a Java method to display the first 50 pentagonal numbers.
 * Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon,
 * but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.
 */
public class Q7 {
    public static void main(String[] args) {
        // Call the method to display the first 50 pentagonal numbers
        pentagonalNumbers();
    }

    /**
     * Method to display the first 50 pentagonal numbers
     */
    public static void pentagonalNumbers() {
        int n = 0;
        // Loop through the first 50 numbers
        for (int i = 1; i <=50; i++) {
            // Calculate the nth pentagonal number
            n = i * (3 * i - 1) / 2;
            // Print the nth pentagonal number
            System.out.println(n);
        }
    }
}