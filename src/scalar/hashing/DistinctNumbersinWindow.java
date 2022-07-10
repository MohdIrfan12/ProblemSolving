package scalar.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctNumbersinWindow {
    public static void main(String[] args) {
        int arr[] = {31, 51, 31, 51, 31, 31, 31, 31, 31, 31, 51, 31, 31};
        System.out.println(Arrays.toString(dNums(arr, 3)));
    }

    private static int[] dNums(int[] arr, int window) {
        int arrsize = arr.length;
        if (window > arrsize) {
            int res[] = new int[0];
            return res;
        }
        int noOfWindows = arrsize - window + 1;
        int res[] = new int[noOfWindows];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < window; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
        res[0] = hashMap.size();
        int resultArrrayIndex = 1;
        for (int i = 1; i < arrsize; i++) {
            if (arrsize - i < window) {
                break;
            }

            int starValue = hashMap.get(arr[i-1]);
            if (starValue>1){
                hashMap.put(arr[i-1],starValue-1);
            }else {
                hashMap.remove(arr[i-1]);
            }

            int endIndex = i+window-1;
            if (hashMap.containsKey(arr[endIndex])){
                hashMap.put(arr[endIndex],hashMap.get(arr[endIndex])+1);
            }else {
                hashMap.put(arr[endIndex],1);
            }
            res[resultArrrayIndex] = hashMap.size();
            resultArrrayIndex++;
        }
        return res;
    }

    private static ArrayList<Integer> countDistinct(int A[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (map.containsKey(A[i])) map.put(A[i], map.get(A[i]) + 1);
            else map.put(A[i], 1);
        }
        for (int i = k; i < n; i++) {
            ans.add(map.size());
            if (map.containsKey(A[i - k]) && map.get(A[i - k]) == 1)
                map.remove(A[i - k]);
            else if (map.containsKey(A[i - k]))
                map.put(A[i - k], map.get(A[i - k]) - 1);
            if (map.containsKey(A[i]))
                map.put(A[i], map.get(A[i]) + 1);
            else
                map.put(A[i], 1);
        }
        ans.add(map.size());
        return ans;
    }
}
