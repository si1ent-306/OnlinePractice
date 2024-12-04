package FunctionalProgramming.Streams;

import java.util.List;

public class Q4 {
    //Write a Java program to remove all duplicate elements from a list using streams.
    public static void main(String[] args) {
        List list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List newList = list.stream().distinct().toList();
        System.out.println(list);
        System.out.println(newList);
    }
}
