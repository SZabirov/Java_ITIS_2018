package com.company;

import java.util.ArrayList;

public class IntMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int x = 5;
        Integer c = 5;
        int a = x + c;
        arrayList.add(x);
        arrayList.add(c);
        arrayList.add(a);

//        int y = 1;
//        m(y);
//        System.out.println(y);
//
//        Integer u = 1;
//        M(u);
//        System.out.println(u);

        String s = "1";
        s(s);
        System.out.println(s);

    }

    static void m(int x) {
        x = 42;
    }

    static void M(Integer x) {
        x = 42;
    }

    static void s(String s) {
        s = "42";
    }
}




