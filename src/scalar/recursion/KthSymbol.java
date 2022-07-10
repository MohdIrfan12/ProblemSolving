package scalar.recursion;

public class KthSymbol {

    public static void main(String[] args) {
        System.out.println(solve(2, 2));
    }

    private static int solve(int A, int B) {
        int num = 0;
        if (A % 2 == 0) {
            num = 01;
        }
        int res = 0;
        while (B > 0) {
            res = num % 10;
            B--;
        }
        return res;
    }
}
