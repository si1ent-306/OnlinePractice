package ControlFlow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        //Ternary Operator
        System.out.println(input.nextInt() > 0 ? "The number is positive" :
                input.nextInt() < 0 ? "The number is negative" :
                        "The number is zero");
    }
}
