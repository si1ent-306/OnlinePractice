package Methods;

import java.util.Scanner;

public class Q20 {

    /**
     * Q20: Write a Java method for extracting the first digit from a positive or negative integer.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(firstDigit(input.nextInt()));
    }

    public static int firstDigit(int n) {
        return Math.abs(n) / (int) Math.pow(10, (int) Math.log10(Math.abs(n)));
    }
}