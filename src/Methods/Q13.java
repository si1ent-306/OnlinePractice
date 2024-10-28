package Methods;

import java.util.Scanner;

/**
 * Q13: Write a Java method to compute the area of a triangle with the given side lengths.
 * @author chris
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        // Call the triangleArea method to compute the area of the triangle
        triangleArea(n1, n2, n3);
    }
    /**
     * Method to compute the area of a triangle with the given side lengths.
     * @param a the length of side a
     * @param b the length of side b
     * @param c the length of side c
     */
    public static void triangleArea(int a, int b, int c) {
        // Calculate the semi perimeter
        double semiPerimeter = (a + b + c) / 2.0;
        // Calculate the area of the triangle using Heron's formula
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.println(area);
    }
}