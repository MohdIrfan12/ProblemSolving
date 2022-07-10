package scalar.carryForward;

public class CF4 {

    public static void main(String[] args) {

        int arr[] = {
                16, 17, 4, 3, 5, 2
        };

        int count[] = solve(arr);
        System.out.println();
        for (int item:count) {
            System.out.print(" "+item);
        }
    }

    public static int[] solve(int[] arr) {
        int size = arr.length;
        int leaderElement = arr[size-1];
        int count = 1;
        for(int i=size-2; i>=0;i--){
            if(arr[i]>leaderElement){
                leaderElement = arr[i];
                count++;
            }
        }
        int tempArr[] = new int[count];
        leaderElement = arr[size-1];
        count--;
        tempArr[count] = leaderElement;
        for(int i=size-2; i>=0;i--){
            if(arr[i]>leaderElement){
                count--;
                tempArr[count] = arr[i];
                leaderElement = arr[i];
            }
        }
        return tempArr;
    }
}
