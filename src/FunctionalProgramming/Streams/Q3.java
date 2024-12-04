package FunctionalProgramming.Streams;

import java.util.Arrays;

public class Q3 {
    //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenSum = Arrays.stream(numbers).filter(num -> num % 2 == 0).sum();
        int oddSum = Arrays.stream(numbers).filter(num -> num % 2 != 0).sum();
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
