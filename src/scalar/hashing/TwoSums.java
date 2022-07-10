package scalar.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    public static void main(String[] args) {
//        int arr[] = {2, 7, 11, 15};
//        System.out.println(Arrays.toString(twoSum(arr, 9)));
        int arr[] = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        System.out.println(Arrays.toString(twoSum(arr, -3)));
    }

    private static int[] twoSum(final int[] arr, int target) {
        if(arr==null || arr.length<2)
            return new int[1];

        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int startIndex = map.get(arr[i]);
                int endIndex = i;
                return new int[]{startIndex+1, endIndex+1};
            }else if (!map.containsKey(target-arr[i])){
                map.put(target-arr[i], i);
            }
        }
        return new int[1];
//        int res[] = new int[2];
//        if (arr.length < 1) {
//            return res;
//        }
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 1; i < arr.length; i++) {
//            hashMap.put(arr[i], i + 1);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int a = arr[i];
//            int b = sum - a;
//            if (hashMap.containsKey(b)) {
//                if (hashMap.get(b) > i + 1) {
//                    res[0] = i + 1;
//                    res[1] = hashMap.get(b);
//                }
//            }
//        }
//        return res;
    }
}
