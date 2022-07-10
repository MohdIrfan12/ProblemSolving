package scalar.bitmanupulation;

public class DeecimalToBinaryWithBitwiseOperator {

    public static void main(String[] args) {
//        printBinaryForm(2147483647);
        long n=3;
        printBinaryForm(n);
    }
    private static void printBinaryForm(long n) {
       for (int i=31;i>=0;i--){
          long binaryNo = n>>i;
          if ((binaryNo&1)==1){
              System.out.print("1");
          }else {
              System.out.print("0");
          }
       }
//        for(int i = index-1;i >= 0;i--){
//            System.out.print(binary[i]);
//        }
    }
}
