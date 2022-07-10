package scalar.subarrrays;

public class MaximumSubarray {


    public static void main(String[] args) {
//        int arr[] = {3, 8, 8, 9, 7};
//        System.out.println(maxSubarray(7, arr));
//        int arr[] = {1, 2, 4, 4, 5, 5, 5, 7, 5};
//        System.out.println(maxSubarray(14,arr));
//        int arr[] = {4};
//        System.out.println(maxSubarray(14,arr));
//        int arr[] = {8, 7};
//        System.out.println(maxSubarray(4,arr));
        int arr[] = {7, 10, 3, 1 };
        System.out.println(maxSubarray(11,arr));
    }

    private static int maxSubarray(int sum, int[] arr) {
        int size = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int curSum = arr[i];
            for (int j = i + 1; j < size; j++) {
                if (curSum == sum) {
                    return curSum;
                } else if (curSum > sum ||(curSum + arr[j]) > sum) {
                    break;
                }
                curSum = curSum + arr[j];
            }
            System.out.println(curSum);
            if (curSum == sum) {
                return curSum;
            }else if (curSum<sum && maxSum<curSum){
                maxSum = curSum;
            }
        }
        if (maxSum==Integer.MIN_VALUE){
            return 0;
        }
        return maxSum;
    }
}
