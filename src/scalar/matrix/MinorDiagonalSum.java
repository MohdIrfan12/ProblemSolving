package scalar.matrix;

public class MinorDiagonalSum {

    public static void main(String[] args) {

    }

    public int solve(final int[][] mat) {
        int row = 0;
        int colomn = mat.length-1;

        int ans = 0;
        while (row<mat.length){
            ans = ans+mat[row][colomn];
            row++;
            colomn--;
        }
        return ans;
    }
}
