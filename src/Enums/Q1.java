package Enums;
//Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
public class Q1 {
    public enum DAYS_OF_WEEK {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        DAYS_OF_WEEK day = DAYS_OF_WEEK.THURSDAY;
        System.out.println(day);
    }
}
