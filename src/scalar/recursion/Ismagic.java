package scalar.recursion;

public class Ismagic {
    // Given a number A, check if it is a magic number or not.
    //
    //A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by
    // adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number
    // is a magic number.

    public static void main(String[] args) {
        System.out.println(solve(1291));
    }

    private static int solve(int num) {
       if (num<10){
           if (num==1){
               return 1;
           }else {
               return 0;
           }
       }
       return solve(sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        if (num==0){
            return 0;
        }
        return num%10+sumOfDigits(num/10);
    }


}
