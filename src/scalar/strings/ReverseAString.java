package scalar.strings;

public class ReverseAString {

    public static void main(String[] args) {
        String data = "scaler";
        System.out.println(solve(data));
    }

    private static String solve(String data) {
        StringBuilder builder = new StringBuilder();
        int endIndex = data.length() - 1;
        while (endIndex>=0) {
            builder.append(data.charAt(endIndex));
           endIndex--;
        }
        return builder.toString();
    }
}
