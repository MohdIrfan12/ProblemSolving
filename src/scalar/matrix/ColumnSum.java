package scalar.matrix;

public class ColumnSum {

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };

        int res[] = solve(arr);
        for (int item:res) {
            System.out.println(item);
        }
    }

    private static int[] solve(int[][] arr) {
        int res[] = new int[arr[0].length];
        for (int i=0;i<arr[0].length;i++){
            int sum =0;
            for (int j=0;j<arr.length;j++){
                sum  = sum+arr[j][i];
            }
            res[i] = sum;
        }
        return res;
    }
}
