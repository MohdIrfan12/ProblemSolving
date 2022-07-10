package scalar.array.rotation;

public class LeftRotation {

    // In the left rotation, each element of the array will be shifted to its left by one position
    // and the first element of the array will be added to end of the list
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        // 2 3 4 5 6 1
        optimised(arr, 2);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    private static void rotation(int arr[], int k) {
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            rotation(arr);
        }
    }

    private static void rotation(int arr[]) {
        int lastIndex = arr.length - 1;
        int temp = arr[0];
        for (int i = 0; i <lastIndex; i++) {
            arr[i] = arr[i + 1];
        }
        arr[lastIndex] = temp;
    }

    private static void optimised(int arr[],int k){
        int size = arr.length;
        int i, j;
        k = k % size;
        // Reverse the entire array
        for (i = 0, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the first n-k terms
        for (i = 0, j = size - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Reverse last k numbers
        for (i = size - k, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
