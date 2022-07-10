package scalar.hashing;

import java.util.HashMap;

public class DiffkII {
    // Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j
    // such that A[i] - A[j] = k, i != j.

    public static void main(String[] args) {
     int arr[] = {66, 37, 46, 56, 49, 65, 62, 21, 7, 70, 13, 71, 93, 26, 18, 84, 96, 65, 92, 69, 97,
             47, 6, 18, 17, 47, 28, 71, 70, 24, 46, 58, 71, 21, 30, 44, 78, 31, 45, 65, 16, 3, 22, 54,
             51, 68, 19, 86, 44, 99, 53, 24, 40, 92, 38, 81, 4, 96, 1, 13, 45, 76, 77, 8, 88, 50, 89,
             38, 60, 61, 49, 25, 10, 80, 49, 63, 95, 74, 29, 27, 52, 27, 40, 66, 38, 22, 85,
             22, 91, 98, 19, 20, 78, 77, 48, 63, 27};
        System.out.println(diffPossible(arr,31));

    }

    private static int diffPossible(final int[] arr, int sum) {
        if (arr.length==1){
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], i);
        }

        for (int i=0;i< arr.length;i++){
            int a = arr[i];
            int b = a-sum;
            if (hashMap.containsKey(b) && hashMap.get(b)!=i){
                System.out.println(a+" "+ b);
                return 1;
            }
        }
        return 0;
    }

}
