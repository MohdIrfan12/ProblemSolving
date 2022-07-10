package scalar.bitmanupulation;

public class Numberof1Bits {

    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }

    private static int numSetBits(int num) {
       int count = 0;
       while (num>0){
           if ((num&1)==1){
               count ++;
           }
           num = num>>1;
       }
       return count;
    }
}
