package scalar.strings;

import java.util.Arrays;

public class UpperCaseToLowerCase {

    public static void main(String[] args) {
       char arr[] = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
       to_lower(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static char[] to_lower(char[] arr) {
        for (int i=0;i<arr.length;i++) {
            char item = arr[i];
            if (item>=65 && item<=90){
                arr[i] = (char) (item ^ (1<<5));
            }
        }
        return arr;
    }


}
