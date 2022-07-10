package leetcode;

public class Question1 {

    public static void main(String[] args) {
        int arr[] = {3,2,3};
       int res[] = twoSum(arr,6);
        for (int item:res) {
            System.out.print(" "+item);
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        int size = arr.length;
        int pfarr[] = new int[2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(i!=j && arr[i]+arr[j]==target){
                    pfarr[0] = i;
                    pfarr[1] = j;
                }
            }
        }
        return pfarr;
    }

}
