package scalar.array;

public class RangeSumQuery {


    public static void main(String[] args) {
//        int arr[]  = {1, 2, 3, 4, 5};
//        int query[][] = {{1, 4}, {2, 3}};

//        int arr[]  = {2, 2, 2};
//        int query[][] = {{1, 1}, {2, 3}};
        int arr[] = {4, 5, 6, 9, 4, 1, 8, 3};
        int query[][] = {
                {2, 4},
                {7, 8},
                {1, 4},
                {1, 6},
                {8, 8},
                {2, 2},
                {4, 8},
                {2, 4},
                {7, 8},
                {6, 7}
        };

        long res[] = rangeSum(arr, query);
        for (long item : res) {
            System.out.println(item);
        }
    }

    private static long[] rangeSum(int[] arr, int[][] query) {
        long pfSum[] = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                pfSum[i] = arr[i];
            } else {
                pfSum[i] = pfSum[i - 1] + arr[i];
            }
        }
        long result[] = new long[query.length];
        for (int i = 0; i < query.length; i++) {
            int queryItem[] = query[i];
            int leftIndex = queryItem[0];
            int right = queryItem[1];
            leftIndex = leftIndex - 2;
            right = right - 1;
            if (leftIndex < 0) {
                result[i] = pfSum[right];
            } else {
                result[i] = pfSum[right] - pfSum[leftIndex];
            }
        }
        return result;
    }
}
