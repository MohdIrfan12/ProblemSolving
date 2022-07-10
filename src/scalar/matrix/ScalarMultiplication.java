package scalar.matrix;

public class ScalarMultiplication {
    public static void main(String[] args) {

    }

    public int[][] solve(int[][] mat, int B) {
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                mat[i][j] = mat[i][j]*B;
            }
        }
        return mat;
    }
}
