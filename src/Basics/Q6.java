package Basics;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print("Enter an integer: ");
        int m = sc.nextInt();
        System.out.println(n + " + " + m + " = " + (n + m));
        System.out.println(n + " - " + m + " = " + (n - m));
        System.out.println(n + " * " + m + " = " + (n * m));
        System.out.println(n + " / " + m + " = " + (n / m));
        System.out.println(n + " % " + m + " = " + (n % m));
    }
}
