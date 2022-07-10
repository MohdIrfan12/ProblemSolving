package scalar.bitmanupulation;

public class DeecimalToBinary {

    public static void main(String[] args) {
        printBinaryForm(2147483647);
    }
    private static void printBinaryForm(int n) {
        int binary[] = new int[32];
        int index = 0;
        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
