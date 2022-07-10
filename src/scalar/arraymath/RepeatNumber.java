package scalar.arraymath;

public class RepeatNumber {

    public static void main(String[] args) {
       int arr[] = {1, 2, 1, 2, 2,2};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement( int[] arr) {
        int count1 =0;
        int count2 =0;
        int majElement1 =Integer.MIN_VALUE;
        int majElement2 =Integer.MIN_VALUE;
        // find majority element
        for (int i=0;i<arr.length;i++){
            if (arr[i]==majElement1){
                count1++;
            }else if (arr[i]==majElement2){
                count2++;
            }else if (count1==0){
                count1++;
                majElement1=arr[i];
            }else if (count2==0){
                count2++;
                majElement2=arr[i];
            }else {
                count1--;
                count2--;
            }
        }

        // validate
        count1=0;
        count2=0;
        for (int item:arr){
            if (item==majElement1){
                count1++;
            }else if (item==majElement2){
                count2++;
            }
        }
        if (count1>arr.length/3){
            return majElement1;
        }else if (count2>arr.length/3){
            return majElement2;
        }else {
            return -1;
        }
    }
}
