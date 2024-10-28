package BigO;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100000) + 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n);
        }
        System.out.println("Random array of "+n+" numbers");
        //An example of an operation that takes constant time is accessing an element in an array by its index.
        //For example, accessing the element at index 5 takes constant time.
        System.out.println("Constant time");
        constantTime(array, 5);
        //Binary search on a sorted array is a classic example of O(logn).
        // This search algorithm works by repeatedly dividing the search range in half.
        System.out.println("Logarithmic time");
        logarithmicTime(array, 5);
        //An example of an operation that takes linear time is summing up all the elements in an array.
        //For example, the sum of all the elements in the array takes linear time.
        System.out.println("Linear time");
        linearTime(array);
        //An example of an operation that takes linearithmic time is sorting an array using merge sort.
        //For example, sorting the array in ascending order takes linearithmic time.
        System.out.println("Linearithmic time");
        linearithmicTime(array);
        //An example of an operation that takes quadratic time is sorting an array using bubble sort.
        //For example, sorting the array in ascending order takes quadratic time.
        System.out.println("Quadratic time");
        quadraticTime(array);
        //An example of an operation that takes exponential time is calculating the nth fibonacci number.
        //For example, calculating the 10th fibonacci number takes exponential time.
        int index = (int) (Math.random() * 100) + 1;
        System.out.println("Exponential time");
        exponentialTime(index);
    }
    public static void constantTime(int[] array, int index) {
        int startTime = (int) System.currentTimeMillis();
        //Regardless of the array size, accessing any specific index takes the same amount of time, so it's O(1).
        int endTime = (int) System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+"ms");
    }
    public static void logarithmicTime(int[] array, int index) {
        //The binary search function reduces the search space by half each time, leading to O(logn) time complexity.
        int startTime = (int) System.currentTimeMillis();
        Arrays.binarySearch(array, index);
        int endTime = (int) System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+"ms");
    }
    public static void linearTime(int[] array) {
        //The linear search function checks every element in the array, leading to O(n) time complexity.
        int startTime = (int) System.currentTimeMillis();
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        int endTime = (int) System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+"ms");
        //The loop runs once for each element in the array, so the time complexity is O(n).
    }
    public static void linearithmicTime (int[] array) {
        //The merge sort function recursively splits the array into smaller subarrays and then merges them back together, leading to O(nlogn) time complexity.
        int startTime = (int) System.currentTimeMillis();
        mergeSort(array, 0, array.length-1);
        int endTime = (int) System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+"ms");
    }

    public static void mergeSort(int[] array, int left, int right) {
        //If the left index is less than the right index, we have more than one element in the array, so we need to recursively split it.
        if(left < right) {
            //Calculate the middle index which will be used to split the array.
            int middle = (left + right) / 2;
            //Split the left half of the array.
            mergeSort(array, left, middle);
            //Split the right half of the array.
            mergeSort(array, middle + 1, right);
            //Once the array is split into individual elements, merge them back together in sorted order.
            merge(array, left, middle, right);
        }
    }
    public static void merge(int[] array, int left, int middle, int right) {
        // Determine the size of the two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays for the left and right subarrays
        int[] tempLeft = new int[n1];
        int[] tempRight = new int[n2];

        // Copy data to temporary arrays from the original array
        for (int i = 0; i < n1; i++) {
            tempLeft[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            tempRight[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (tempLeft[i] <= tempRight[j]) {
                array[k] = tempLeft[i];
                i++;
            } else {
                array[k] = tempRight[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of tempLeft[], if any
        while (i < n1) {
            array[k] = tempLeft[i];
            i++;
            k++;
        }

        // Copy remaining elements of tempRight[], if any
        while (j < n2) {
            array[k] = tempRight[j];
            j++;
            k++;
        }
    }
    public static void quadraticTime(int[] array) {
        //The quadratic time complexity is O(n^2).
        int startTime = (int) System.currentTimeMillis();
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int endTime = (int) System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+"ms");
    }
    public static void exponentialTime(int index) {
        //The exponential time complexity is O(2^n).
        int startTime = (int) System.currentTimeMillis();
        int result = fibonacci(index);
        int endTime = (int) System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime-startTime)+"ms");
    }
    /**
     * This function calculates the nth Fibonacci number.
     * @param n the number to calculate
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        try {


            // Base case
            if (n <= 1) {
                return n;
            }
            // Recursive case
            // Recursion works by breaking down the problem into smaller
            // sub-problems of the same type. In this case, the sub-problems
            // are to calculate the (n-1)th and (n-2)th Fibonacci numbers.
            // The solutions to these sub-problems are then combined to
            // form the solution to the original problem.
            return fibonacci(n - 1) + fibonacci(n - 2);
        }catch (StackOverflowError e) {
            System.out.println("Overflow");
        }
        return 0;
    }
}
