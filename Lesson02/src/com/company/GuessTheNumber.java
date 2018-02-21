package com.company;

import java.util.Random;
/*
    Угадай число
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int rNum = rand.nextInt(10) + 1;
        System.out.println(rNum);
        //3 попытки
    }
}
