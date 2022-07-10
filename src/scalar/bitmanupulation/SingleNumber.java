package scalar.bitmanupulation;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int ar[] = {1, 2, 2, 3, 1};
        System.out.println(2^4);
    }

    private static int singleNumber(final int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
