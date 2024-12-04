package FunctionalProgramming.Streams;

import java.util.Arrays;

public class Q5 {
    //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
    public static void main(String[] args) {
        String [] words = "welcome to the test of JAVA As JAVA is always easy to test".split(" ");
        System.out.println(Arrays.stream(words).filter(word -> word.startsWith("J")).count());
    }
}
