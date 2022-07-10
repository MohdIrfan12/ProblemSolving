package scalar.modularAirthmatic;

public class ModString {

    public static void main(String[] args) {
        System.out.println(findMod("43535321",47));
    }

    private static int findMod(String data, int b) {
        long ans = 0;
        int length = data.length();
        long power = 1;
        for (int i=length-1;i>=0;i--){
            int digit = Character.getNumericValue(data.charAt(i));
            ans = ans+(digit%b*power)%b;
            power = (10%b*power)%b;
        }
        return (int) (ans%b);
    }

}
