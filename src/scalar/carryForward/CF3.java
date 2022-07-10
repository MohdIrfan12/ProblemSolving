package scalar.carryForward;

public class CF3 {

    public static void main(String[] args) {

        int arr[] = {
                1, 1, 1, 1
        };

        int count = countFlips(arr,arr.length);
        System.out.println(count);
    }

    public static int countFlips(int a[], int n) {
        int state = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (state == a[i]) {
                if (state == 0)
                    state = 1;
                else
                    state = 0;
                count++;
            }
        }
        return count;
    }
}


