package com.company;

public class ProcedureExamplev01 {
    public static void main(String[] args) {
        int s1 = sum(5, 7);
        int s2 = sum(56, 78);
        String s = concat("Привет, ", "Петя!");
        System.out.println(s);

        int[] arr = {5, 4, 2, 1, 3};
        int[] arr1 = {12, 78, 2, 1, 3};
        int[] arr2 = {67, 4, 98, 1, 3};
        printNumbers(arr);
        printNumbers(arr1);
        printNumbers(arr2);
    }

    //функция, склеивающая две строки
    static String concat(String s1, String s2) {
        return s1 + s2;
    }

    //функция
    static int sum (int a, int b) {
        int s = a + b;
        return s;
    }

    //процедура, печатающая числа в строку
    static void printNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
