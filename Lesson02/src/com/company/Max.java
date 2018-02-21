package com.company;

import java.util.Scanner;

/*
    С консоли вводится 10 чисел. Вывести максимальное
    6 5 7 8 3 6 8 0 5 6
    -> 8
 */
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int counter = 0;
        //6 5 7 8 3 6 8 0 5 6
        int max = sc.nextInt();
        while (counter < 9) {
            x = sc.nextInt();
            if(x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
