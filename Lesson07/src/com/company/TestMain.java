package com.company;


public class TestMain {
    public static void main(String[] args) {
//        int a = 42;
//        setOne(a);
//        System.out.println(a);

        int[] arr = {42, 42, 42, 42, 42};
        setOne(arr);
        System.out.println(arr[0]);
    }

    static void setOne(int x) {
        x = 1;
    }



    static void setOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }








}
