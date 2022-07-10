package scalar.subarrrays;

public class GoodSubarrays {

    // Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
    //1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
    //2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
    //Your task is to find the count of good subarrays in A.
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        System.out.println(bruteForce(arr, 4));
        int arr[] = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        System.out.println(bruteForce(arr, 65));
    }

    private static int bruteForce(int[] arr, int sum) {
        int size = arr.length;
        int ans = 0;
        for (int i = 0; i < size; i++) {
            int curSum = arr[i];
            int index2 = i;
            if (i % 2 == 0) {
                index2 = i + 1;
            }
            if (index2 % 2 == 0) {
                if (curSum < sum) {
                    ans++;
                }
            } else {
                if (curSum > sum) {
                    ans++;
                }
            }
            for (int j = i + 1; j < size; j++) {
                curSum = curSum + arr[j];
                int index = j;
                if (i % 2 == 0) {
                    index = j + 1;
                }
                if (index % 2 == 0) {
                    if (curSum < sum) {
                        ans++;
                    }
                } else {
                    if (curSum > sum) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
