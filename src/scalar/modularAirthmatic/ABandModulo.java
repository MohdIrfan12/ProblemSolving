package scalar.modularAirthmatic;

public class ABandModulo {

    public static void main(String[] args) {
        System.out.println(solve(11,18));
    }

    protected static int solve(int A, int B) {
         int m = Math.abs(A-B);
         return m;
    }
}
