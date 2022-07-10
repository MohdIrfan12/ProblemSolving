package scalar.sorting;

import java.util.Arrays;

public class ArithmeticProgression {
    /**
     * Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
     *
     * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
     */

    public static void main(String[] args) {
//      int arr[] = {3, 5, 1};
      int arr[] = {2, 4, 1};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        if (size<=1){
            return 0;
        }
        int diff = arr[1] -arr[0];
        for (int i=2;i<size;i++){
            if (arr[i]-arr[i-1]!=diff){
                return 0;
            }
        }
        return 1;
    }
}
