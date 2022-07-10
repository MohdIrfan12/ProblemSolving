package scalar.bitmanupulation;

public class CountSetUnsetBit {

    public static void main(String[] args) {
        int number = 3;
        usingRightShift(number);
        formal(number);
    }

    private static void usingRightShift(int number){
        int setBit = 0;
        int unsetBit = 0;
        while (number>0){
            if ((number&1)==1){
                setBit++;
            }else {
                unsetBit++;
            }
            number=number>>1;
        }
        System.out.println(setBit+" "+unsetBit);
    }

    private static void formal(int n){
        int setBit = 0;
        int unsetBit = 0;
        while (n>0){
            if (n%2==1){
                setBit++;
            }else {
                unsetBit++;
            }
            n = n/2;
        }
        System.out.println(setBit+" "+unsetBit);
    }
}
