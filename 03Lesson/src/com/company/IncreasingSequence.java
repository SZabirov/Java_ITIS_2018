package com.company;


import java.util.Scanner;
/*
    Определить, возрастающая ли последовательность
    Обратить внимание на переменную isIncreasing,
    которая показывает, является ли последовательность возрастающей
 */
public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = sc.nextInt();
        int x;
        int prev = sc.nextInt();
        int counter = 0;
        boolean isIncreasing = true;
        while (counter < n - 1 & isIncreasing) {
            x = sc.nextInt();
            if (x <= prev) {
                isIncreasing = false;
            }
            prev = x;
            counter++;
        }
        if (isIncreasing) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }
    }
}
