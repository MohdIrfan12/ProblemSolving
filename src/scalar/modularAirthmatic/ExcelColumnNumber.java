package scalar.modularAirthmatic;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        String title = "ABCD";
        System.out.println(titleToNumber(title));
    }

    private static int titleToNumber(String title) {
        int res = 0;
        int temp = 26;
        for (int i=0;i<title.length();i++){
            int alphabetsNo = getAlphabetsNo(title.charAt(i));
            res = res*temp;
            res = res+alphabetsNo-getAlphabetsNo('A')+1;
        }
        return res;
    }

    private static int getAlphabetsNo( char alpha){
        if (alpha=='A'){
            return 1;
        }else if (alpha=='B'){
            return 2;
        }else if (alpha=='C'){
            return 3;
        }else if (alpha=='D'){
            return 4;
        }else if (alpha=='E'){
            return 5;
        }else if (alpha=='F'){
            return 6;
        }else if (alpha=='G'){
            return 7;
        }else if (alpha=='H'){
            return 8;
        }else if (alpha=='I'){
            return 9;
        }else if (alpha=='J'){
            return 10;
        }else if (alpha=='K'){
            return 11;
        }else if (alpha=='L'){
            return 12;
        }else if (alpha=='M'){
            return 13;
        }else if (alpha=='N'){
            return 14;
        }else if (alpha=='O'){
            return 15;
        }else if (alpha=='P'){
            return 16;
        }else if (alpha=='Q'){
            return 17;
        }else if (alpha=='R'){
            return 18;
        }else if (alpha=='S'){
            return 19;
        }else if (alpha=='T'){
            return 20;
        }else if (alpha=='U'){
            return 21;
        }else if (alpha=='V'){
            return 22;
        }else if (alpha=='W'){
            return 23;
        }else if (alpha=='X'){
            return 24;
        }else if (alpha=='Y'){
            return 25;
        }else if (alpha=='Z'){
            return 26;
        }else {
            return 0;
        }
    }
}
