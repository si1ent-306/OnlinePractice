package DataTypes;

import java.math.BigInteger;
import java.util.Scanner;

public class Q14 {
    //Write a Java program to extract the primitive type value from a given BigInteger value.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger bigInteger = input.nextBigInteger();
        System.out.println(bigInteger.longValue());
        System.out.println(bigInteger.floatValue());
        System.out.println(bigInteger.doubleValue());
        System.out.println(bigInteger.byteValue());
        System.out.println(bigInteger.shortValue());
        System.out.println(bigInteger.intValue());
    }
}
