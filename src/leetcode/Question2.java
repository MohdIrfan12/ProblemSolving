package leetcode;

import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
       int nums1[] = {1,2};
       int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length+nums2.length;
        int clubbedArrray[] = new int[size];
        for (int i=0;i<nums1.length;i++){
            clubbedArrray[i] = nums1[i];
        }
        int j = nums1.length;
        for (int i=0;i<nums2.length;i++){
            clubbedArrray[j] = nums2[i];
            j++;
        }

        Arrays.sort(clubbedArrray);
        if(size==0){
            return 0;
        }else if (size==1){
            return clubbedArrray[0];
        }
        int index = size/2;
        if(size%2==0){
            double item1 = clubbedArrray[index-1];
            double item2 = clubbedArrray[index];
            double res=  (item1+item2)/2.0;
            return res;
        }else {
            return clubbedArrray[index];
        }
    }
}
