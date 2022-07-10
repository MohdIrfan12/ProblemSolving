package scalar.matrix;

//  Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
public class AntiDiagonals {

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 5},
                {4, 5, 6, 7},
                {7, 8, 9, 8},
                {7, 8, 9, 8}
        };
        int res[][] = diagonal(arr);
        for (int i = 0; i < res.length; i++) {
            int[] item = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" "+item[j]);
            }
            System.out.println();
        }
    }

    private static int[][] diagonal(int[][] matrix) {
        int size = matrix.length;
        int result[][] = new int[2*size-1][size];

        int k =0;
        for (; k < size; k++) {
            int x = 0;
            int y = k;
            for (int j = 0; j < size; j++) {
                if (x >= size || y < 0) {
                    result[k][j] = 0;
                } else {
                    result[k][j] = matrix[x][y];
                }
                x++;
                y--;
            }
        }

        for (int i = 1; i < size&& k<result.length; i++) {
            int x = i;
            int y = size-1;
            for (int j = 0; j < size; j++) {
                if (x >= size || y < 0) {
                    result[k][j] = 0;
                } else {
                    result[k][j] = matrix[x][y];
                }
                x++;
                y--;
            }
            k++;
        }
        return result;
    }
}
