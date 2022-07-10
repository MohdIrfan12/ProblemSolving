package scalar.strings;

public class LongestPalindromeString {

    public static void main(String[] args) {
        String data = "abbcccbbbcaaccbababcbcabca";
//        String data = "abbm";
        System.out.println(longestPalindrome(data));
    }

    private static String longestPalindrome(String data) {
        if (data == null || data.length() < 1)
            return "";
        int start = 0, end = 0;
        int len =0;
        for (int i = 0; i < data.length(); i++) {
            int length1 = expand(data, i, i);
            int length2 = expand(data, i, i + 1);
           int temp = Math.max(length1, length2);
           if (temp>len){
               len = temp;
               if (len>end-start){
                   start = i-(len-1)/2;
                   end = i+len/2;
               }
           }
        }
        return data.substring(start,end+1);
    }

    private static int expand(String data, int start, int end) {
        while (start >= 0 && end < data.length() && data.charAt(start) == data.charAt(end)) {
                start--;
                end++;
        }
        return end - start - 1;
    }
}
