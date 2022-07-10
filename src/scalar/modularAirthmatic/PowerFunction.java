package scalar.modularAirthmatic;

public class PowerFunction {

    public static void main(String[] args) {
        int num = 2;
        int power = 5;
        System.out.println(powerFunc(num,power));
        powerFunc();
        powerFuncMultiplicationRule();
    }

    private static final int powerFunc(int num, int power){
        int ans= 1;
        for (int i=1;i<=power;i++){
            ans = (ans*num);
        }
        return ans;
    }

    // Implement a power fine which returns aN%p
    //ie power a n p antop
    // a 2 n 5 P 7
    private static final void powerFunc(){
        int a = 2;
        int n =  5;
        int p = 7;
        int ans= 1;
        for (int i=1;i<=n;i++){
            ans = (ans*a)%p;
        }
        System.out.println(ans);
    }

    // Implement a power fine which returns aN%p
    //ie power a n p antop
    // a 2 n 5 P 7
    private static final void powerFuncMultiplicationRule(){
        int a = 2;
        int n =  5;
        int p = 7;
        int ans= 1;
        for (int i=1;i<=n;i++){
            ans = (ans%p*a%p)%p;
        }
        System.out.println(ans);
    }
}
