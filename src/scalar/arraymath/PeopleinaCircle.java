package scalar.arraymath;

public class PeopleinaCircle {

    public static void main(String[] args) {
        System.out.println(solve());
    }

    private static int solve(){
        int num = 100;
        int nearestPowerOf2 = findPower(num);
        int noOfKillsToReachNearestPower = num-nearestPowerOf2;
        int position = 2*noOfKillsToReachNearestPower+1;
        return position;
    }

    private static int findPower(int num){
        int res=1;
        while (true){
           int ans = res*2;
           if (ans>num){
               break;
           }
           res = ans;
        }
        return res;
    }
}
