package scalar.matrix;

public class SubtractTheMatrix {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int res[][] = solve(a, b);
        for (int i = 0; i < res.length; i++) {
            int item[] = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" " +item[j]);
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] mat1, int[][] mat2) {
        int result[][] = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            int item[] = mat1[i];
            for (int j = 0; j < item.length; j++) {
                result[i][j] = item[j] - mat2[i][j];
            }
        }
        return result;
    }
}
