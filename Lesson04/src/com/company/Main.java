package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*
    Сортировка выбором
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            int minIndex = j;
            for (int i = j; i < n; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int buf = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = buf;
        }
        System.out.println(Arrays.toString(arr));
    }
}
