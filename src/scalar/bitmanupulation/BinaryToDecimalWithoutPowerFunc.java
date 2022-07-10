package scalar.bitmanupulation;

public class BinaryToDecimalWithoutPowerFunc {

    public static void main(String[] args) {
        long n = 011;
        System.out.println( binaryToDecimal(n));
    }

    private static long binaryToDecimal(long n) {
        long decimal = 0;
        long base = 1;
        while (n>0){
            long lastDigit = n%10;
            n = n/10;
            decimal = decimal+lastDigit*base;
            base = base*2;
        }
        return decimal;
    }
}
