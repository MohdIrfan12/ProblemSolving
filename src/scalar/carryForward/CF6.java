package scalar.carryForward;

public class CF6 {

    public static void main(String[] args) {
        String data  = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        System.out.println(solve(data));
    }

    private static int solve(String data) {
        int size = data.length();
        char arr[] = new char[size];
        int ans = 0;
        for(int i = 0;i<size;i++){
            char ch = data.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'
                    ||ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
                int length = size-i;
                ans = (ans+length)%10003;
            }
        }
        return ans;
    }
}
