package com.company;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int rNum = rand.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        int x;
        int counter = 0;
        boolean guessed = false;
        while (counter < 3 & !guessed) {
            x = sc.nextInt();
            if (x == rNum) {
                guessed = true;
            } else {
                if (x < rNum) {
                    System.out.println("Поробуй взять число больше");
                } else {
                    if (x > rNum) ;
                    System.out.println("Попробуй взять число меньше");
                }
            }
            counter++;
        }
        if (guessed) {
            System.out.println("Вы угадали число! Возможно, вы Гений!!!");
        } else {
            System.out.println("Вы не угадали! Повезет в чем-то другом ;(");
        }
    }
}

