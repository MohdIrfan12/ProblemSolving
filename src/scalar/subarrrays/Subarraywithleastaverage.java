package scalar.subarrrays;

public class Subarraywithleastaverage {

    public static void main(String[] args) {
        int arr[] = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        System.out.println(solve(arr,9));
    }

    private static int solve(int[] arr, int devider) {
        int index = -1;
        int endIndex = devider;
        int size = arr.length;;
        if(size<=devider){
            return index;
        }
        int pfSum[] = new int[size];
        for (int i=0;i<size;i++){
            if (i==0){
                pfSum[i] = arr[i];
            }else {
                pfSum[i] = pfSum[i-1]+arr[i];
            }
            System.out.print(pfSum[i]+" ");
        }
        System.out.println();
        double leastAvg = Integer.MAX_VALUE;
        endIndex--;
        for (int i=0;i< arr.length && i+endIndex< arr.length;i++){
            int sum = 0;
            if(i==0){
                sum =  pfSum[i+endIndex];
            }else {
                sum = pfSum[i+endIndex] - pfSum[i-1];
            }
            double avg = (double) sum/devider;
            System.out.println(sum+" "+avg+" "+leastAvg+" "+i);
            if(avg<leastAvg){
                leastAvg = avg;
                index = i;
            }
        }
        System.out.println();
        return index;
    }
}
