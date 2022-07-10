package scalar.arraymath;

public class MajorityElement {
    public static void main(String[] args) {
      int arr[] = {2, 1, 2};
      int res = majorityElement(arr);
        System.out.println(res);
    }

    private static int majorityElement( int[] arr) {
        int count =1;
        int majElement =arr[0];
        // find majority element
        for (int i=1;i<arr.length;i++){
            if (count==0){
                majElement = arr[i];
                count++;
            }
            else if (arr[i]==majElement){
                count++;
            }else {
                count--;
            }
        }

        // validate
        count=0;
        for (int item:arr){
            if (item==majElement){
                count++;
            }
        }
        if (count>=arr.length/2){
            return majElement;
        }else {
            return -1;
        }
    }
}
