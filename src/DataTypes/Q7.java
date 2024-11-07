package DataTypes;

import java.util.Scanner;

public class Q7 {
    //Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds),
    // and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        int hours = input.nextInt();
        int mins = input.nextInt();
        int seconds = input.nextInt();

        int newDistance = distance / 1609;
        seconds += mins * 60;
    }
}
