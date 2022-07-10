package scalar.recursion;

public class WhatWouldBeTheAnswer2 {

    public static void main(String[] args) {
        System.out.println(func1(2, 10));
    }

    private static int func1(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return func1(x * x, n / 2);
        } else
            return x * func1(x * x, (n - 1) / 2);
    }
}
