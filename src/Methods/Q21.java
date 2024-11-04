package Methods;

import java.util.Scanner;

public class Q21 {
    //Write a Java method to display the factors of 3 in a given integer.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        factorsOfThree(num);
    }

    private static void factorsOfThree(int num) {
        System.out.print(num + " = ");
        int result = num;
        while (result % 3 == 0){
            System.out.print("3 * ");
            result = result / 3;
        }
        System.out.println(result);
    }
}
