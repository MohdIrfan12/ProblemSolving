package scalar.sorting;

import java.util.Arrays;

public class SortbyColor {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortColors(int[] arr) {
        int startIndex =arr.length-1;
        int loopExitIndex =0;
        for (int i=arr.length-1;i>=loopExitIndex;i--){
            if (arr[i]!=0){
                swap(arr,i,startIndex);
                startIndex--;
            }
        }
        loopExitIndex = startIndex;
        startIndex = arr.length-1;
        for (int i=arr.length-1;i>loopExitIndex;i--){
            if (arr[i]!=1){
                swap(arr,i,startIndex);
                startIndex--;
            }
        }
        loopExitIndex = startIndex;
        startIndex = arr.length-1;
        for (int i=arr.length-1;i>loopExitIndex;i--){
            if (arr[i]!=2){
                swap(arr,i,startIndex);
                startIndex--;
            }
        }
        return arr;
    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
