package scalar.subarrrays;

public class SumofAllSubarrays {

    public static void main(String[] args) {
        int arr[] = {2, 9, 5};
//        System.out.println(bruteForce(arr));
        System.out.println(optimised(arr));
//        optimised(arr);
    }

    private static int bruteForce(int arr[]) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                maxSum = maxSum + sum;
            }
        }
        return maxSum;
    }

    private static long optimised(int arr[]) {
        int size = arr.length;
        long sum = 0;
        for (int i = 0; i < size; i++) {
            long itemCountInAllSubarrays = (long) (i + 1) *(size-i);
            long temp = (long) arr[i] *itemCountInAllSubarrays;
            System.out.println(temp+" "+itemCountInAllSubarrays);
            sum = sum+temp;
        }
        return sum;
    }
}
