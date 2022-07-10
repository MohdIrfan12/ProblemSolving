package scalar.bitmanupulation;

public class ReverseBits {
    public static void main(String[] args) {
        long binary[] = convertDecimalToBinary(3);
        reverseBit(binary);
        long number = binaryToDecimal(binary);
        System.out.println(number);
    }

//    private static long reverse(long num) {
//        int reverse = 1;
//        int pos = 32 - 1;
//        while (num > 1 && pos >= 1) {
//            reverse = reverse << pos;
//            if ((num & 1) == 1) {
//                reverse = reverse ^ 1;
//            }
//            num = num >> 1;
//            pos--;
//        }
//        return reverse;
//    }

    private static long[] convertDecimalToBinary(long num){
        long binary[] = new long[Integer.SIZE];
        int index = binary.length-1;
        while (num>0){
            long temp = num%2;
            binary[index--] =temp;
            num = num/2;
        }
        return binary;
    }

    private static void reverseBit(long[] binary) {
        int start =0;
        int end = binary.length-1;
        while (start<end){
            long temp = binary[start];
            binary[start] = binary[end];
            binary[end] = temp;
            start++;
            end--;
        }
    }

    private static long binaryToDecimal(long binary[]){
        long decimal = 0;
        int length = binary.length;
        for (int i=0;i<length;i++){
            decimal = (long) (decimal+ binary[i]*Math.pow(2,length-i-1));
        }
        return decimal;
    }
}
