package ControlFlow.ConditionalStatements;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        if (one >= two && one >= three) {
            System.out.println("The largest number is: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("The largest number is: " + two);
        } else {
            System.out.println("The largest number is: " + three);
        }
    }
}
