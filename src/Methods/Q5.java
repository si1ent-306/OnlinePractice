package Methods;

import java.util.Scanner;

/**
 * Q5: Write a Java method to count the number of words in a given sentence.
 */
public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.println(countWords(string));
    }

    /**
     * Method to count the number of words in a given sentence.
     * @param string the sentence to count the words in
     * @return the number of words in the sentence
     */
    public static int countWords(String string) {
        // split the string into individual words
        String[] words = string.split(" ");
        // return the number of words
        return words.length;
    }
}