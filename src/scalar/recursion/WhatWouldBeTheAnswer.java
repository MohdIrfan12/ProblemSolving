package scalar.recursion;

public class WhatWouldBeTheAnswer {

    public static void main(String[] args) {
        System.out.println(func1(3,5));
    }

    private static int func1(int x, int y){
        if (y==0){
            return 1;
        }
        return func2(x,func1(x,y-1));
    }

    private static int func2(int x, int y){
        if (y==0){
            return 0;
        }
        return x+func2(x,y-1);
    }
}
