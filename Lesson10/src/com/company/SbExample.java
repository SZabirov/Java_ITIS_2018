package com.company;

public class SbExample {
    public static void main(String[] args) {
        sb();
    }

    static String s() {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + "42";
        }
        return s;
    }

    static String sb() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("42");
        }
        return sb.toString();
    }
}
