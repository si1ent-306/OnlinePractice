package Basics;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        String n = sc.next();
        System.out.println(Integer.parseInt(n,2));
    }
}
