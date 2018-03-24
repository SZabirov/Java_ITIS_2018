package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        int lastDigit = n % 10;
        return sumOfDigits(n / 10) + lastDigit;
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int factValue = n * fact(n - 1);
        return factValue;
    }


    //n! = 1*2*...*(n-1)*n
//    static int fact(int n) {
//        int factValue = 1;
//        for (int i = 1; i <= n; i++) {
//            factValue = factValue * i;
//        }
//        return factValue;
//    }
}
