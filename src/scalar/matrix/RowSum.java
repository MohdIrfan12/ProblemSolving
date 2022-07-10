package scalar.matrix;

public class RowSum {
    public static void main(String[] args) {

    }

    public int[] solve(int[][] mat) {
        int res[] = new int[mat.length];
        for (int i=0;i<mat.length;i++){
            int result=0;
            for (int j=0;j<mat[i].length;j++){
                result = result+mat[i][j];
            }
            res[i] = result;
        }
        return res;
    }
}
