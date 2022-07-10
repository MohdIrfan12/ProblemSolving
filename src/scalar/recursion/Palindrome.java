package scalar.recursion;

public class Palindrome {

    public static void main(String[] args) {

        String data = "MOMM";
        System.out.println(isPalindrome(data, 0,data.length()-1));
    }

    private static boolean isPalindrome(String data, int start, int end){
        if (start>end){
            return true;
        }
        if (data.charAt(start)==data.charAt(end)){
            return isPalindrome(data,start+1,end-1);
        }else {
            System.out.println(start+" "+end);
            return false;
        }
    }
}
