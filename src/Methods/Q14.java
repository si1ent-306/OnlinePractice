package Methods;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfSides = input.nextInt();
        int side= input.nextInt();
        areaOfPentagone(numOfSides, side);
    }
    public static void areaOfPentagone(int numOfSides, int side) {
        double a = (1.0 / 4.0) * Math.sqrt(numOfSides * (numOfSides + 2 * Math.sqrt(numOfSides))) * Math.pow(side, 2);
        System.out.println(a);
    }
}
