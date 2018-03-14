package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextInt();
        double c = s * 15;//стоимость
        if (c >= 150) {
            c = (c / 100) * 95;
        }
        System.out.println(c);
    }
}
