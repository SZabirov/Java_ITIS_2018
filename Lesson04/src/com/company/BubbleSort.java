package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сортировка пузырьком
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
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
        System.out.println(Arrays.toString(arr));
    }
}
