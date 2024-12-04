package FunctionalProgramming.Streams;

import java.util.Arrays;

public class Q2 {
    //Write a Java program to convert a list of strings to uppercase or lowercase using streams.
    public static void main(String[] args) {
        String[] words = "welcome to the test of JAVA As JAVA is always easy to test".split(" ");
        System.out.println("All [lower case]: " + Arrays.toString(Arrays.stream(words).map(String::toLowerCase).toArray()));
    }
}
