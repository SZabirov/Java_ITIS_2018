package com.company;

public class TestMainFinal {
    public static void main(String[] args) {
        Number n = new Number();
        n.value = 42;
        setOne(n);
        System.out.println(n.value);
    }

    static void setOne(Number number) {
        number.value = 1;
    }
}
