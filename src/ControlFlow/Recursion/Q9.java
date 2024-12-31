package ControlFlow.Recursion;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = countOddOccurrences(array);
        System.out.println("An odd number occurs " + count + " times in the array.");
    }
    public static int countOddOccurrences(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int count = 0;
        if (array[0] % 2 != 0) {
            count = 1;
        }
        return count + countOddOccurrences(Arrays.copyOfRange(array, 1, array.length));
    }
}
