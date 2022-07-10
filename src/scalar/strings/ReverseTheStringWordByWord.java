package scalar.strings;

public class ReverseTheStringWordByWord {

    public static void main(String[] args) {
        String data = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(solve(data));
    }

    private static String solve(String data) {
        StringBuilder stringBuilder = new StringBuilder();
        int endIndex = data.length();
        for (int i = data.length() - 2; i > 0; i--) {
            if (data.charAt(i) != ' ') {
                if (data.charAt(i+1)==' '&& data.charAt(i-1)==' '){
                    stringBuilder.append(data.charAt(i));
                    stringBuilder.append(' ');
                }
                else if (data.charAt(i - 1) == ' ' && i < endIndex) {
                    stringBuilder.append(data, i, endIndex);
                    if (stringBuilder.charAt(stringBuilder.length()-1)!=' '){
                        stringBuilder.append(' ');
                    }
                }
            }else {
                endIndex = i;
            }
        }

        if (data.charAt(0) != ' ') {
            stringBuilder.append(data, 0, endIndex);
        }
        return stringBuilder.toString();
    }
}
