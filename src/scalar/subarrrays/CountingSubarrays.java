package scalar.subarrrays;

public class CountingSubarrays {
    // Given an array A of N non-negative numbers and a non-negative number B,
    //you need to find the number of subarrays in A with a sum less than B.
    //We may assume that there is no overflow.

    public static void main(String[] args) {
        int arr[] = {3, 9, 11};
        System.out.println(bruteForce(arr, 10));

        int arr1[] = {15, 8, 16};
        System.out.println(bruteForce(arr1, 242));
    }

    private static int bruteForce(int[] arr, int sum) {
        int size = arr.length;
        int cout = 0;
        for (int i = 0; i < size; i++) {
            int curSum = arr[i];
            int iterationCount = 1;
            for (int j = i + 1; j < size; j++) {
                if (curSum >= sum || (curSum + arr[j]) >= sum) {
                    break;
                }
                iterationCount++;
                curSum = curSum + arr[j];
            }
            if (curSum < sum) {
                cout = cout+iterationCount;
            }
        }
        return cout;
    }
}
