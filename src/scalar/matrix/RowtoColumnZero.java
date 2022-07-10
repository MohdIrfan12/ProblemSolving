package scalar.matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RowtoColumnZero {

    public static void main(String[] args) {
        int arr[][] = {
                {51, 21, 90, 38, 57, 12, 11, 1, 68, 60},
                {81, 24, 63, 97, 75, 70, 23, 91, 39, 84},
                {0, 21, 97, 12, 46, 48, 50, 3, 57, 69},
                {44, 8, 42, 34, 99, 0, 98, 10, 53, 67},
                {23, 34, 43, 86, 31, 18, 9, 54, 61, 48},
                {90, 61, 21, 87, 26, 67, 88, 28, 70, 45},
                {98, 14, 5, 92, 1, 4, 44, 99, 67, 98},
                {18, 42, 32, 61, 80, 64, 32, 89, 70, 93},
                {89, 61, 7, 10, 0, 85, 29, 40, 13, 0},
                {85, 63, 66, 43, 56, 67, 99, 0, 67, 66},
        };
        int res[][] = solve(arr);
        for (int i = 0; i < res.length; i++) {
            int[] item = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" " + item[j]);
            }
            System.out.println();
        }

//        [0 0 0 0 0 0 0 0 0 0 ]
//        [0 14 75 54 11 23 54 0 33 23 ]
//        [0 11 2 80 6 43 67 0 73 4 ]
//        [0 22 23 68 23 73 85 0 25 7 ]
//        [0 83 22 81 89 85 56 0 32 89 ]
//        [0 0 0 0 0 0 0 0 0 0 ]
//        [0 3 11 33 71 86 6 0 78 31 ]
//        [0 36 66 90 17 55 27 0 99 59 ]
//        [0 18 65 68 87 3 28 0 9 70 ]
//        [0 19 73 5 52 96 91 0 52 21 ]

    }

    private static int[][] solve(int[][] mat) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    hashMap.put(j, i);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int row = entry.getValue();
            int colomn = entry.getKey();
            System.out.println(row+" "+colomn);

            Arrays.fill(mat[row], 0);
            for (int j = 0; j < mat.length; j++) {
                mat[j][colomn] = 0;
            }
        }
        return mat;
    }
}
