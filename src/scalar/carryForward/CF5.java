package scalar.carryForward;

public class CF5 {

    public static void main(String[] args) {
      int arr[] = {2, 4, 7, 8, 6};
        System.out.println(solve(arr));
    }

    private static String solve(int[] arr) {
        System.out.println(arr.length%2+"  "+arr[0]+"  "+arr[arr.length-1]);
        if(arr.length%2!=0 || arr[0]%2!=0 || arr[arr.length-1]%2!=0)
            return "NO";
        else
            return "YES";
    }
}
