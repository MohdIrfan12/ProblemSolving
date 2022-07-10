package scalar.recursion;

public class SumofDigits {

    public static void main(String[] args) {

        int number = 46;
        int sum =0;
        while (number>0){
           sum = sum+ number%10;
            number = number/10;
        }

        System.out.println(sum);
        System.out.println(solve(46));
    }

    private static int solve(int num) {
        if (num==0){
            return 0;
        }
        return num%10+solve(num/10);
    }
}
