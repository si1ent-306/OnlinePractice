package ControlFlow.Recursion;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 5;
        int count = countOccurrences(array, element);
        System.out.println("The element " + element + " occurs " + count + " times in the array.");
    }
    public static int countOccurrences(int[] array, int element) {
        if (array.length == 0) {
            return 0;
        }
        int count = 0;
        if (array[0] == element) {
            count = 1;
        }
        return count + countOccurrences(Arrays.copyOfRange(array, 1, array.length), element);
    }
}
