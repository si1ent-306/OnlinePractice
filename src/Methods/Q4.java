package Methods;

import java.util.Scanner;

/**
 * Q4: Write a Java method to count all vowels in a string.
 * @author chris
 */
public class Q4 {
    public static void main(String[] args) {
        //Create a scanner to read the input
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        //Print out the number of vowels in the string
        System.out.println(countVowels(string));
    }

    /**
     * @param string the string to count the vowels
     * @return the number of vowels in the string
     */
    private static int countVowels(String string) {
        //Create a string of vowels
        String vowels = "aeiouAEIOU";
        int sum = 0;
        //loop through each character in the string and add it to the sum
        for(char c : string.toCharArray()) {
            //if the character is a vowel, then add it to the sum
            if(vowels.indexOf(c) != -1){
                sum++;
            }
        }
        //return the number of vowels
        return sum;
    }
}
