package leetcode.subarrray;

public class CountSubIslands {

    // You are given two m x n binary matrices grid1 and grid2 containing only 0's (representing water) and 1's
    // (representing land). An island is a group of 1's connected 4-directionally (horizontal or vertical).
    // Any cells outside of the grid are considered water cells.
    //
    //An island in grid2 is considered a sub-island if there is an island in grid1 that contains all the
    // cells that make up this island in grid2.
    //
    //Return the number of islands in grid2 that are considered sub-islands.

    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1}
        };
        int[][] grid2 = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0}
        };
        int count = countSubIslands(grid1, grid2);
        System.out.println(count);
    }

    private static int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {
                if (grid2[i][j] == 1) {
                    count =count+ floodFill(grid1, grid2, i, j);
                }
            }
        }
        return count;
    }

    private static int floodFill(int[][] grid1, int[][] grid2, int i, int j) {
        if (i < 0 || i >= grid1.length || j < 0 || j >= grid2[0].length)
            return 1;
        if (grid2[i][j] != 1)
            return 1;

        grid2[i][j] = 2; // mark 2 as visited

        int count1 = floodFill(grid1, grid2, i + 1, j);
        int count2 = floodFill(grid1, grid2, i - 1, j);
        int count3 = floodFill(grid1, grid2, i, j + 1);
        int count4 = floodFill(grid1, grid2, i, j - 1);
        int count5 = grid1[i][j];
        int res= count1 & count2 & count3 & count4 & count5;
//        System.out.println(count1+" "+count2+" "+count3+" "+count4+" "+count5+" "+res);
        return res;
    }
}


