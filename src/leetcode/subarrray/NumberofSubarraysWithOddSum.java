package leetcode.subarrray;

public class NumberofSubarraysWithOddSum {
    // Given an array of integers arr, return the number of subarrays with an odd sum.

    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
//        System.out.println(solve(arr));
        System.out.println(solve2(arr));
//        solve2(arr);
    }

//    private static int solve(int arr[]) {
//        int oddSubArrCount = 0;
//        boolean odd = false;
//        for (int item : arr) {
//            if (item % 2 == 1) {
//                odd = !odd;
//            }
//            if (odd) {
//                oddSubArrCount++;
//            }
//        }
//        int result = 0;
//        int size = arr.length;
//        for (int i = 0; i < size; i++) {
//            result = result + oddSubArrCount;
//            if (arr[i] % 2 == 1) {
//                oddSubArrCount = Math.abs(size - i - oddSubArrCount);
//            }
//        }
//        return result;
//    }

    private static int solve2(int arr[]) {
        int mod = 1000000007;
        int sum = 0;
        int result = 0;
        int even = 1;
        int odd = 0;
        for (int item : arr) {
            sum = sum + item;
            if ((sum & 1) != 0) {
                result = (result + even) % mod;
                odd++;
            } else {
                result = (result + odd) % mod;
                even++;
            }
        }
        return result;
    }
}
