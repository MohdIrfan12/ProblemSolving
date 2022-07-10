package scalar.matrix;

public class AreMatricesSame {

    public static void main(String[] args) {

    }

    public int solve(int[][] mat1, int[][] mat2) {
        if (mat1.length!=mat2.length){
            return 0;
        }else if (mat1[0].length!=mat2[0].length){
            return 0;
        }else {
            for (int i=0;i<mat1.length;i++){
                for (int j=0;j<mat1[i].length;j++){
                    if (mat1[i][j]!=mat2[i][j]){
                        return 0;
                    }
                }
            }
            return 1;
        }
    }
}
