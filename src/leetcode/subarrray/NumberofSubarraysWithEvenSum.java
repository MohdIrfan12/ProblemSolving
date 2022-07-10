package leetcode.subarrray;

public class NumberofSubarraysWithEvenSum {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
//        System.out.println(solve(arr));
        System.out.println(solve2(arr));
    }

//    private static int solve(int arr[]) {
//        int ithEvenArrCount = 0;
//        int result =  0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1) {
//                ithEvenArrCount = arr.length - (i + 1) - ithEvenArrCount;
//            }else {
//                ithEvenArrCount++;
//            }
//            result = result+ithEvenArrCount;
//        }
//        return result;
//    }

    private static int solve2(int arr[]) {
        int mod = 1000000007;
        int sum = 0;
        int result = 0;
        int even = 0;
        int odd = 1;
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
