package com.company;

import java.util.Arrays;

public class ProcedureExample {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {5, 3, 1, 2, 4};
        int[] arr1 = {4, 1, 2, 5, 42, 34, 76};
        boolean isSorted = false;
        for (int j = 0; j < n - 1 & !isSorted; j++) {
            isSorted = true;
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        n = 7;
        isSorted = false;
        for (int j = 0; j < n - 1 & !isSorted; j++) {
            isSorted = true;
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    isSorted = false;
                    int buf = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
