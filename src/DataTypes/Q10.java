package DataTypes;

import java.util.Scanner;

public class Q10 {
    //Write a Java program to break an integer into a sequence of digits.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        char[] numArray = Integer.toString(num).toCharArray();
        for(char c : numArray){
            System.out.println(c);
        }
    }
}
