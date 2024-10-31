package Methods;

public class Q17 {
    public static void main(String[] args) {
        //Write a Java method to count the number of digits in an integer with the value 2.
        System.out.println(digitsWithValue2(1232));
    }
    public static int digitsWithValue2(int n) {
        int count = 0;
        for (char c : Integer.toString(n).toCharArray()) {
            if (c == '2') {
                count++;
            }
        }
        return count;
    }
}
