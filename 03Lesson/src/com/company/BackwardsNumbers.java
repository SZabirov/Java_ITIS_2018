package com.company;


import java.util.Scanner;

public class BackwardsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (i < n) {
            array[i] = sc.nextInt();
            i++;
        }

        //выводит элементы массива в прямом порядке
        for (i = 0; i < n; i++) {
            System.out.println(i + ": " + array[i]);
        }

        //выводит элементы массива в обратном порядке
        for (i = n - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
