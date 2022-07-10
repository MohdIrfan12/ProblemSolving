package scalar.array;

import java.util.ArrayList;
import java.util.HashSet;

public class Maximumpositivity {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6};
//        int arr[] = {7963262, 4011787, -833371, -1424649, -8187311, 6441214, -6071318, -7578657, -9536626, 7395028};
//        int arr[] = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575, 1, 1, 1};
        int arr[] = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575 };
        int res[] = solve(arr);
        for (int item : res) {
            System.out.print(item + " ");
        }

    }

    private static int[] solve(int[] arr) {
        int count = 0;
        int finalCount = 0;
        int endIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (count > finalCount) {
                    finalCount = count;
                    endIndex = i;
                }
                count = 0;
            }
            else if (i == arr.length - 1) {
                count++;
                if (count > finalCount) {
                    finalCount = count;
                    endIndex = i+1;
                }
            } else {
                count++;
            }
        }
        int res[] = new int[finalCount];
        int startIndex = endIndex - finalCount;
        for (int i = 0; i < finalCount; i++) {
            res[i] = arr[startIndex++];
        }
        return res;
    }

}
