package scalar.matrix;

public class SpiralMatrix {

    public static void main(String[] args) {

        int res[][] = generateMatrix(3);
        for (int i = 0; i < res.length; i++) {
            int item[] = res[i];
            for (int j = 0; j < item.length; j++) {
                System.out.print(" " +item[j]);
            }
            System.out.println();
        }

    }

    private static int[][] generateMatrix(int number) {
        int res[][] = new int[number][number];
        int L = 0;
        int R = number - 1;
        int T = 0;
        int B = number - 1;
        int D = 0;
        int num = 1;
        while (num <= (number * number)) {
            if (D == 0) {
                for (int i = L; i <= R; i++) {
                    res[T][i] = num++;
                }
                T++;
                D = 1;
            }else if(D==1){
                for (int i = T; i <= B; i++) {
                    res[i][R] = num++;
                }
                R--;
                D = 2;
            }else if(D==2){
                for (int i = R; i >= L; i--) {
                    res[B][i] = num++;
                }
                B--;
                D = 3;
            }
            else if(D==3){
                for (int i = B; i >= T; i--) {
                    res[i][L] = num++;
                }
                L++;
                D = 0;
            }
        }
        return res;
    }
}
