package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] array1 = {-1, 0, 1, 3, 5, 9};
//        int[] array2 = {4, 6, 8, 10, 12, 13, 21};
//        int[] res;
//        res = merge(array1, array2);
//        System.out.println(Arrays.toString(res));

        int[] arr = {4, 6, 8, 10, 12, 13, 21, -1, 0, 1, 3, 5, 9};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        int n = arr.length;
        if (n <= 2) {
            if (n == 2) {
                if(arr[0] > arr[1]) {
                    int x = arr[0];
                    arr[0] = arr[1];
                    arr[1] = x;
                }
            }
            return arr;
        } else {
            int l1, l2;
            if (n % 2 == 0) {
                l1 = n / 2;
                l2 = n / 2;
            } else {
                l1 = (n + 1) / 2;
                l2 = n / 2;
            }
            int[] arr1 = new int[l1];
            int[] arr2 = new int[l2];
            for (int i = 0; i < l1; i++) {
                arr1[i] = arr[i];
            }
            for (int i = l1; i < n; i++) {
                arr2[i - l1] = arr[i];
            }
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            return merge(arr1, arr2);
        }
    }


    static int[] merge(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] resultArr = new int[l1 + l2];
        int i1 = 0, i2 = 0;
        while (i1 < l1 & i2 < l2) {
            if (arr1[i1] < arr2[i2]) {
                resultArr[i1 + i2] = arr1[i1];
                i1++;
            } else {
                resultArr[i1 + i2] = arr2[i2];
                i2++;
            }
        }
        while (i1 < l1) {
            resultArr[i1 + i2] = arr1[i1];
            i1++;
        }
        while (i2 < l2) {
            resultArr[i1 + i2] = arr2[i2];
            i2++;
        }
        return resultArr;
    }

}
