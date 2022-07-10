package scalar.array;

public class EvenOdd {

    public static void main(String[] args) {
        int arr[] = {0, 3, 2};
        arrange(arr);
    }

    private static void arrange(int arr[]) {
        int lastevenPosition = 0;
        for (int i = 0; i < arr.length && lastevenPosition < arr.length; i++) {
            int item = arr[i];
            if (item % 2 == 0) {
                int temp = arr[lastevenPosition];
                arr[lastevenPosition] = item;
                arr[i] = temp;
                lastevenPosition = lastevenPosition + 2;
            }
        }
        for (int item : arr) {
            System.out.print(" " + item);
        }
    }
}
