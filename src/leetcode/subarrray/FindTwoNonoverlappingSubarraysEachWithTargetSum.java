package leetcode.subarrray;

import java.util.HashMap;

public class FindTwoNonoverlappingSubarraysEachWithTargetSum {
    // You have to find two non-overlapping sub-arrays of arr each with a sum equal target.
    // There can be multiple answers so you have to find an answer where the sum of the
    // lengths of the two sub-arrays is minimum.

    public static void main(String[] args) {
//        int arr[] = {4,3,2,6,2,3,4};
//        int res = minSumOfLengths(arr, 6);
//        int arr[] = {3,2,2,4,3};
//        int res = minSumOfLengths(arr, 3);
//        int arr[] = {1, 1, 1, 2, 2, 2, 4, 4};
//        int res = minSumOfLengths(arr, 6);
//        int arr[] = {64, 5, 20, 9, 1, 39};
//        int res = bruteForrce(arr, 69);
        int arr[] = {2, 1, 3, 3, 2, 3, 1};
        int res = optimised(arr, 6);
        System.out.println(res);
    }

    private static int bruteForrce(int[] arr, int target) {
        int size = arr.length;
        int firstSubArrIndex = 0;
        int secondSubArrIndex = 0;

        for (int i = 0; i < size; i++) {
            int currSum = arr[i];
            int startIndex = i;
            int endIndex = i;
            boolean isItemFound = false;
            for (int j = i + 1; j < size; j++) {
                if (currSum == target) {
                    isItemFound = true;
                    break;
                }
                if (currSum > target || (currSum + arr[j]) > target) {
                    break;
                }
                endIndex = j;
                currSum = currSum + arr[j];
            }

            if (currSum == target) {
                isItemFound = true;
            }
            if (isItemFound) {
                int diff = endIndex - startIndex + 1;
                if (firstSubArrIndex == 0) {
                    firstSubArrIndex = diff;
                } else if (secondSubArrIndex == 0) {
                    secondSubArrIndex = diff;
                } else {
                    int temp1 = firstSubArrIndex + diff;
                    int temp2 = secondSubArrIndex + diff;
                    if (temp1 > temp2) {
                        firstSubArrIndex = diff;
                    } else {
                        secondSubArrIndex = diff;
                    }
                }
                i = endIndex;
            }
        }
        if (firstSubArrIndex == 0 || secondSubArrIndex == 0) {
            return -1;
        }
        return firstSubArrIndex + secondSubArrIndex;
    }


    // In the first loop create a hash map from the array using prefix sum and index.
    //In the second loop, first, find the first sub-array from the previous index to the current index, find (current sum -target) in the map, if found update the size of the first sub-array min(size, i – m[sum-target]).
    //Find the second sub-array from current index, find (sum + target) in the map, length of second sub-array will be m[sum+target] – i.
    //Final result : min(res, size + min[sum+target] -i).
    private static int optimised(int[] arr, int target) {
        int size = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        hashMap.put(0, -1);
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            hashMap.put(sum, i);
        }
        sum = 0;
        int firstLength = size + 1;
        int total = firstLength;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            if (hashMap.containsKey(sum - target)) {
                int startIndex = i - hashMap.get(sum - target);
                firstLength = Math.min(firstLength, startIndex);
            }
            if (hashMap.containsKey(sum + target)) {
                int end = firstLength + hashMap.get(sum + target) - i;
                total = Math.min(total, end);
            }
        }
        if (total == size + 1)
            return -1;
        else
            return total;
    }
}
