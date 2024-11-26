package ControlFlow.ConditionalStatements;

/**
 * Q2: Write a Java program to solve quadratic equations (use if, else if and else).
 *
 * The quadratic equation is in the form of ax^2 + bx + c = 0.
 * The discriminant is b^2 - 4ac.
 * If the discriminant is positive, the equation has two distinct real roots.
 * If the discriminant is zero, the equation has one real root.
 * If the discriminant is negative, the equation has two distinct complex roots.
 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: "); double a = input.nextDouble(); System.out.print("Enter b: "); double b = input.nextDouble(); System.out.print("Enter c: "); double c = input.nextDouble();

        // Calculate the discriminant
        double delta = b * b - 4 * a * c;

        // If the discriminant is positive, the equation has two distinct real roots.
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots are real and different.\nRoot 1 = " + root1 + "\nRoot 2 = " + root2);
        }
        // If the discriminant is zero, the equation has one real root.
        else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and same.\nRoot = " + root);
        }
        // If the discriminant is negative, the equation has two distinct complex roots.
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("The roots are complex and different.\nRoot 1 = " + realPart + " + " + imaginaryPart + "i\nRoot 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}