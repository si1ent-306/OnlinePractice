package DataTypes;

import java.util.Scanner;

public class Q6 {
    //Write a Java program to compute the body mass index (BMI).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println(BMI);
    }
}
