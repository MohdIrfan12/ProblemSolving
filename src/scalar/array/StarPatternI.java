package scalar.array;

public class StarPatternI {

    public static void main(String[] args) {
        printDiamond(4);
    }

    private static void printDiamond(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = (2 * i - 2); j < (2 * num - 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
