package scalar.array.rotation;

public class RightRotation {

    // to rotate an array by right, we need to shift all elements towards the end of the array, which means the last
    // element will end up with the first position

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        // ans - 6 1 2 3 4 5
        optimised(arr, 1);
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
        int index = arr.length - 1;
        int temp = arr[index];
        for (int i = index; i >0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    private static void optimised(int arr[],int k){
        int size = arr.length;
        int i, j;
        k = k % size;
        // Reverse last k numbers
        for (i = size - k, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the first n-k terms
        for (i = 0, j = ( size-1) - k; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the entire array
        for (i = 0, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
