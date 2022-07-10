package scalar.matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{94, 91}
                    };
        int b[][] = { {35, -52, -12, 26, -93, -61},
                      {29, -20, -36, -9, 66, 15}
                     };

        int res[][] = solve(a,b);
        for (int i = 0; i < res.length; i++) {
            int[] item = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" " + item[j]);
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] mat1, int[][] mat2) {
        int result[][] = new int[mat1.length][mat2[0].length];
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[i].length;j++){
                int res = 0;
                for (int k=0;k<mat2.length;k++){
                    int a = mat2[k][j];
                    int b=  mat1[i][k];
                    res =res+ (a*b);
                }
                result[i][j] = res;
            }
         }
         return result;
    }
}
