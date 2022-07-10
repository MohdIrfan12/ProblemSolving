package scalar.modularAirthmatic;

public class Divisibilityby8 {

    public static void main(String[] args) {
        System.out.println(solve("152"));
    }

    private static int solve(String data) {
        if (data.length()<=2){
            int num = Integer.parseInt(data);
            if (num%8==0){
                return 1;
            }else {
                return 0;
            }
        }else {
            int num = Integer.parseInt(data.substring(data.length()-3));
            if (num%8==0){
                return 1;
            }else {
                return 0;
            }
        }
    }
}
