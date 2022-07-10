package scalar.bitmanupulation;

public class HelpFromSam {

    public static void main(String[] args) {
        System.out.println(solve(3));
    }

    private static int solve(int num) {
        int helpCount = 0;
        while (num>0){
            if (num%2==1){
                helpCount++;
            }
            num = num/2;
        }
        return helpCount;
    }
}
