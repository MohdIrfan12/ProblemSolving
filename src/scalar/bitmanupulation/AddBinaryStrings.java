package scalar.bitmanupulation;

public class AddBinaryStrings {

    public static void main(String[] args) {
        String first = "1010110111001101101000";
        String second = "1000011011000000111100110";
        System.out.println(addBinary(first, second));
    }

    private static String addBinary(String a, String b) {
        String result = "";
        int sizeA = a.length() - 1;
        int sizeB = b.length() - 1;
        int max = Math.max(sizeA, sizeB);
        int carry = 0;
        for (int i = max; i >= 0; i--) {
            char aIthChar = '0';
            if (sizeA >= 0) {
                aIthChar = a.charAt(sizeA);
            }
            char bIthChar = '0';
            if (sizeB >= 0) {
                bIthChar = b.charAt(sizeB);
            }
            if (aIthChar == '1' && bIthChar == '1') {
                result = carry + result;
                carry = 1;
            } else if (aIthChar == '1') {
                if (carry == 1) {
                    result = 0 + result;
                } else {
                    result = aIthChar + result;
                }
            } else if (bIthChar == '1') {
                if (carry == 1) {
                    result = 0 + result;
                } else {
                    result = bIthChar + result;
                }
            } else {
                result = carry + result;
                carry = 0;
            }
            sizeA--;
            sizeB--;
        }
        if (carry == 1) {
            result = carry + result;
            carry = 0;
        }
        return result;
    }
}
