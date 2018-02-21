package com.company;

import java.util.Scanner;

/*
    С консоли вводится 10 чисел. Вывести 2 наибольших
    по значению. Наиб. вывести первым. Второе по величине -
    вторым
 */
public class TwoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int counter = 0;
        //5 6 7 8 3 6 8 0 5 6
        int max1 = sc.nextInt();//наибольшее значение
        int max2 = sc.nextInt();//второе по величине значение
        if (max1 < max2) {
            //swap
            int buf = max1;
            max1 = max2;
            max2 = buf;
        }
        while (counter < 8) {
            x = sc.nextInt();
            if(x > max1) {
                max2 = max1;
                max1 = x;
            } else {
                if (x > max2) {
                    max2 = x;
                }
            }
            counter++;
        }
        System.out.println(max1 + " " + max2);
    }
}
