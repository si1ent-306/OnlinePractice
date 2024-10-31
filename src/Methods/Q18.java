package Methods;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        //Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.
        Scanner input = new Scanner(System.in);
        System.out.println(isConsecutive(input.nextInt(), input.nextInt(), input.nextInt()));
    }
    public static boolean isConsecutive(int a, int b, int c) {
        return a + 1 == b && b + 1 == c;
    }
}
