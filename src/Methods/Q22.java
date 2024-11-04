package Methods;

import java.util.Scanner;


public class Q22 {
    //Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false.
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println(isDigitsEven(input.nextInt()));

    }

    public static boolean isDigitsEven(int n){
        char[] arr = Integer.toString(n).toCharArray();
        for (char c : arr) {
            if (c % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
