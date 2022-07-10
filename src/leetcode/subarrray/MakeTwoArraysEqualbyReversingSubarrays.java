package leetcode.subarrray;

public class MakeTwoArraysEqualbyReversingSubarrays {

    public static void main(String[] args) {
        int target[] = {1, 2, 3, 3};
        int arr[] = {2, 3, 1, 3};
        System.out.println(canBeEqual(target, arr));
    }

    private static boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        boolean temp[] = new boolean[arr.length];
        for (int i=0;i<temp.length;i++){
            temp[i] = false;
        }
        for (int item : target) {
            boolean isItemExist = checkItemExist(arr, temp, item);
            if (!isItemExist) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkItemExist(int[] arr, boolean[] temp, int item) {
        boolean isItemFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item && !temp[i]) {
                isItemFound = true;
                temp[i] = true;
                break;
            }
        }
        return isItemFound;
    }
}
