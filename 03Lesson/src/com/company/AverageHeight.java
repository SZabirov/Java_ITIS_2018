package com.company;

import java.util.Scanner;

/*
    1) Вычислить средний рост n учеников в класс
    2) Посчитать и вывести количество учеников,
    рост к-рых > среднего
 */
public class AverageHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//кол-во учеников
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        double averageHeight = sum / n;
        System.out.println("Средний рост: " + averageHeight);
        int moreThanAverageHeightNum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > averageHeight) {
                moreThanAverageHeightNum++;
            }
        }
        System.out.println("Число учеников, рост к-рых выше среднего: " + moreThanAverageHeightNum);
    }
}
