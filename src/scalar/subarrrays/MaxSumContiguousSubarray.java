package scalar.subarrrays;

public class MaxSumContiguousSubarray {

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(bruteForce(arr));
        System.out.println(kadamAlgo(arr));
    }

    private static int bruteForce(final int[] arr) {
        int size = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    // https://leetcode.com/problems/maximum-subarray/discuss/875312/java-solution-kadanes-algorithm-with-detailed-explanation
    private static int kadamAlgo(int arr[]) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = maxEndingHere + arr[i];

            // decide if arr[i] should be included in the current subarray or it should start its own subarray
            if (temp > arr[i]) {
                maxEndingHere = temp;
            } else {
                maxEndingHere = arr[i];
            }
            //
            if(maxEndingHere>maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
}
