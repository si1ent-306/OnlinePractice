package Methods;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumofdigits(n));
    }
    public static int sumofdigits(int n) {
        int sum = 0;
        char[] arr = Integer.toString(n).toCharArray();
        for (char c : arr) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
