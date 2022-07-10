package scalar.strings;

public class Isalnum {
// You are given a function isalpha() consisting of a character array A.
//
//Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.

    public static void main(String[] args) {
        char arr[] = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(solve(arr));
    }

    private static int solve(char[] arr) {
        for (char item : arr) {
            if (item < 48
                    || item>122
                    || item > 57 && item < 65
                    || item> 90 && item<97
            ) {
                  return 0;
            }
        }
        return 1;
    }
}
