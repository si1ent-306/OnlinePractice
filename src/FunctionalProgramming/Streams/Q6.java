package FunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q6 {
    //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
    public static void main(String[] args) {
        String[] strings = "Ahh Hello World John Is Here To Help You".split(" ");
        String[] sorted = new String[]{Arrays.toString(Arrays.stream(strings).sorted().toArray())};
        System.out.println(Arrays.toString(sorted));
        String[] reversedArray = IntStream.range(0, strings.length)
                .mapToObj(i -> strings[strings.length - 1 - i])
                .toArray(String[]::new);

        // Print reversed array
        for (String str : reversedArray) {
            System.out.print(str + " ");
        }
    }
}
