package scalar.recursion;

public class FactorialOfAGivenNumber {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }

    private static int solve(int num) {
        if (num==0 ||num==1){
            return 1;
        }
        return num* solve(num-1);
    }
}
