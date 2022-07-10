package scalar.modularAirthmatic;

public class ReversePower {

    public static void main(String[] args) {
        int power = calculatePower(10,1,47);
        int power2 = calculatePower(10,2,47);
        int power3 = calculatePower(10,3,47);
        int power4 = calculatePower(10,4,47);
        int power5 = calculatePower(10,5,47);
        for (int i=0;i<8;i++){
            System.out.println(power);
        }

        int res = (power%47*power2%47)%47;
        System.out.println(power+" "+power2+" "+power3+" "+power4+" "+power5);

    }

    private static int calculatePower(int num, int power, int b) {
        int ans= 1;
        for (int i=1;i<=power;i++){
            ans = (ans%b*num%b)%b;
        }
        return ans;
    }
//
//    45
//            28
//            31
//            36
//            13
//            6
//            10
//            1
//            20
}
