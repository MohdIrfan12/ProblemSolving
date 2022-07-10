package scalar.recursion;

public class AithFibonacciNo {

    public static void main(String[] args) {
        System.out.println(findAthFibonacci(3));
    }

    public static int findAthFibonacci(int num) {
        if (num==0){
            return 0;
        }else if (num==1){
            return 1;
        }
        return findAthFibonacci(num-1)+findAthFibonacci(num-2);
    }
}
