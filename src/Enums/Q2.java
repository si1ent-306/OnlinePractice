package Enums;
//Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
public class Q2 {
    public enum WEEKEND {
        SUNDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        WEEKEND day = WEEKEND.SUNDAY;
        WEEKEND day2 = WEEKEND.SATURDAY;
        System.out.println(day);
        System.out.println(day2);
    }
}
