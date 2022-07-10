package scalar.matrix;

public class RotateMatrrixBy90 {

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int res[][] = solve(arr);
        for (int i = 0; i < res.length; i++) {
            int[] item = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" " + item[j]);
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] mat) {
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

        for (int i = 0; i < mat.length; i++) {
            int item[] = mat[i];
            int x=0;
            int y = item.length-1;
            while (x < y && y > 0) {
                int temp = item[x];
                item[x] = item[y];
                item[y] = temp;
                x++;
                y--;
            }
        }
        return mat;
    }
}
