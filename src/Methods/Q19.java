package Methods;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        //Write a Java method that accepts three integers and returns true if one is the middle point between the other two integers, otherwise false
        Scanner input = new Scanner(System.in);
        System.out.println(isBetween(input.nextInt(), input.nextInt(), input.nextInt()));
    }

    public static boolean isBetween(int a, int b, int c) {
        return (a < b && b < c) || (a > b && b > c);
    }
}
