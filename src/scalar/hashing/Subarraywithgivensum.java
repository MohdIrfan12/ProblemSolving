package scalar.hashing;

import java.util.Arrays;

public class Subarraywithgivensum {

    public static void main(String[] args) {
        int arr[] = {15, 2, 5, 6, 9};
        int res[] = solve(arr, 13);
        System.out.println(Arrays.toString(res));
    }

    private static int[] solve(int[] arr, int sum) {
        int startIndex = 0;
        int endIndex = -1;
        int sumSoFar = 0;
        for (int i = 0; i < arr.length; i++) {
           sumSoFar = sumSoFar+arr[i];
            while (sumSoFar>sum && startIndex<i){
                sumSoFar = sumSoFar-arr[startIndex];
                startIndex++;
            }
            if (sumSoFar==sum){
                endIndex = i;
                break;
            }
        }
        if (endIndex == -1) {
            int res[] = {-1};
            return res;
        } else {
            int res[] = new int[endIndex - startIndex+1];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr[startIndex];
                startIndex++;
            }
            return res;
        }
    }
}
