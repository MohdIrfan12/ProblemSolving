package scalar.carryForward;

public class CarryForward1 {

    public static void main(String[] args) {
       int arr[] =  { 377, 448, 173, 307, 108 };
       int ans = solve(arr);
        System.out.println(ans);
    }

    public static int solve(int[] arr) {
        int ans = arr.length;
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int data:arr) {
            if (data<min){
                min = data;
            }
            if (data>max){
                max = data;
            }
        }
        if(min ==max){
            return 1;
        }
        int minI  = -1;
        int maxI = -1;
         for (int i = arr.length-1;i>=0;i--){
             if (arr[i]==min){
                 minI = i;
                 int length = Math.abs(minI-maxI)+1;
                 ans = Math.min(length,ans);
             }else if (arr[i] ==max){
                 maxI = i;
                 int length = Math.abs(minI-maxI)+1;
                 ans = Math.min(length,ans);
             }
         }
        return ans;
    }
}
