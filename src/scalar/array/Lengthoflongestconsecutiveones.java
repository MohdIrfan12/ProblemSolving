package scalar.array;

public class Lengthoflongestconsecutiveones {

    public static void main(String[] args) {
//        System.out.println(solve("1101001100101110"));
        System.out.println(solve("1101001100101110"));
    }

    private static int solve(String data) {
        int size = data.length();
        int temp = 0;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '1') {
                count++;
                temp++;
            } else {
                if (temp > maxCount) {
                    maxCount = Math.max(maxCount, temp);
                }
                temp = 0;
            }
        }
        maxCount = Math.max(maxCount, temp);

        int[] pfSumLeft = new int[size];
        int pfSumight[] = new int[size];

        if (data.charAt(0) == '1')
            pfSumLeft[0] = 1;
        else
            pfSumLeft[0] = 0;

        if (data.charAt(size - 1) == '1')
            pfSumight[size - 1] = 1;
        else
            pfSumight[size - 1] = 0;

        for (int i = 1; i < size; i++) {
            if (data.charAt(i) == '1')
                pfSumLeft[i] = pfSumLeft[i - 1] + 1;
            else
                pfSumLeft[i] = 0;
        }

        for (int i = size - 2; i >= 0; i--) {
            if (data.charAt(i) == '1')
                pfSumight[i] = pfSumight[i + 1] + 1;
            else
                pfSumight[i] = 0;
        }

        for (int i = 1; i < size-1; i++) {
            if (data.charAt(i) == '0') {
                int sum = pfSumLeft[i - 1] + pfSumight[i + 1];
                if (sum < count)
                    maxCount = Math.max(maxCount, sum + 1);
                else
                    maxCount = Math.max(maxCount, sum);
            }
        }
        return maxCount;
    }
}
