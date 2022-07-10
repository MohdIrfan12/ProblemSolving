package scalar.bitmanupulation;

public class AddBinaryNumbers {

    public static void main(String[] args) {
        addNumbers("1101",
                   "1111");
    }

    private static void addNumbers(String a, String b){
        int i=a.length()-1;
        int j = b.length()-1;
        String result = "";
        int carry = 0;
        while (i>=0 || j>=0|| carry != 0){
            int s=0;
            s = (i>=0)?Character.getNumericValue(a.charAt(i)):0;
            s = s+((j>=0)?Character.getNumericValue(b.charAt(j)):0);
            System.out.println(carry+" "+s);
            int tempS = (carry+s)%2;
            carry = (carry+s)/2;
            result = tempS+result;
            i--;
            j--;
        }
        System.out.println(result);
    }
}
