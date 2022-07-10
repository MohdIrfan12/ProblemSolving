package scalar.recursion;

public class PowerFunc {

    public static void main(String[] args) {
        System.out.println(pow(71045970, 41535484, 64735492));
    }

    private static int pow(int A, int B, int C) {
        long res = power(A, B, C);
        if (res < 0) {
            return C - Math.abs(A) % C;
        }
        return (int) (res % C);
    }

    private static long power(int A, int B, int C) {
        if (B == 0)
            return 1;
        if (B % 2 == 0) {
            long y = power(A, B / 2, C);
            return (y % C * y % C) % C;
        } else {
            long y = power(A, B - 1, C);
            return (A % C * y % C) % C;
        }
    }

//    private static long power(int num, int power, int mod) {
//        if (power == 0) {
//            return 1;
//        }
//        long halfPower = power(num, power / 2, mod);
//        long y = halfPower % mod;
//        if (power % 2 == 0) {
//            return (y * y) % mod;
//        } else {
//            long z= num % mod;
//            return (y * y * z) % mod;
//        }
//    }
}
