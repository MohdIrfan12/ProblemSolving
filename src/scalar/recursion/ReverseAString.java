package scalar.recursion;

public class ReverseAString {

    public static void main(String[] args) {
         printReverseString("HEllo",4);
    }


    private static void printReverseString(String data, int index){
        if (index==0){

            System.out.print(data.charAt(index));
            return;
        }

        System.out.print(data.charAt(index));
        printReverseString(data,index-1);
    }
}
