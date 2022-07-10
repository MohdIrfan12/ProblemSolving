package scalar.matrix;

public class MatrixTranspose {

    public static void main(String[] args) {
//        int arr[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {7, 8, 9}
//        };
//        int res[][] = usingNewMatrix(arr);

        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int res[][] = inSameSquareMatrix(arr);
        for (int i = 0; i < res.length; i++) {
            int[] item = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" " + item[j]);
            }
            System.out.println();
        }
    }

    private static int[][] usingNewMatrix(int[][] mat) {
        int res[][] = new int[mat[0].length][mat.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = mat[j][i];
            }
        }
        return res;
    }

    private static int[][] inSameSquareMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int x = 0;
            int y = i;
            while (x < y && y > 0) {
                int temp = mat[x][y];
                mat[x][y] = mat[y][x];
                mat[y][x] = temp;
                x++;
                y--;
            }
        }

        for (int i = 1; i < mat.length; i++) {
            int x = i;
            int y = mat.length-1;
            while (x < y && y > 0) {
                int temp = mat[x][y];
                mat[x][y] = mat[y][x];
                mat[y][x] = temp;
                x++;
                y--;
            }
        }
        return mat;
    }
}
