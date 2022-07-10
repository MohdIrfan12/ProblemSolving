package scalar.arraymath;

public class MonkeysAndDoors {

    public static void main(String[] args) {
          solve();
    }

    private static void solve() {
        int openDoorsCount = 0;
        int closeDoorsCount = 0;

        for (int i=1;i<=100;i++){
          if (isPerfectSquare(i)){
              openDoorsCount++;
          }else {
              closeDoorsCount++;
          }
        }
        System.out.println(openDoorsCount+" "+closeDoorsCount);
    }

    private static boolean isPerfectSquare(int num){
        int start = 1;
        int end = num;

        while (start<=end){
            int mid = (start+end)/2;
            int square = mid * mid;
            if (square==num){
                return true;
            }else if (square<num){
                start = mid+1;
            }else
            {
                end = mid-1;
            }
        }
        return false;
    }
}
