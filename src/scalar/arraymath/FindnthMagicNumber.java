package scalar.arraymath;

public class FindnthMagicNumber {

    public static void main(String[] args) {
        System.out.println(solve(5000));
    }

    private static int solve(int num) {
       int binary[]= convertIntoBinary(num);
       int res= convertBinaryToDecimal(binary);
       return res;
    }

    private static int[] convertIntoBinary(int num){
          int binary[] = new int[Integer.SIZE];
          int  length = binary.length-1;
          for (int i=length;i>=0;i--){
              int bDigit = num>>(length-i);
              if ((bDigit&1)==1){
                  binary[i] = 1;
              }else {
                  binary[i] =0;
              }
          }
//        for (int item:binary) {
//            System.out.print(item);
//        }
        return binary;
    }

    private static int convertBinaryToDecimal(int[] binary) {
        int num =0;
        int base=5;
        for (int i= binary.length-1; i>=0;i--) {
            num = num+ binary[i] *base;
            base = base*5;
        }
        return num;
    }
}
