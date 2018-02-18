package com.company;

import java.util.Scanner;

public class ChangeLetterRegister {
    public static void main(String[] args) {
        //A -> a; a -> A
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char changedLetter;
        for (int i = 0; i < s.length(); i = i + 1) {
            char letter = s.charAt(i);
            if (letter >= 'A' & letter <= 'Z') {//если большая
                changedLetter = (char) (letter + 32);
            } else {
                changedLetter = (char) (letter - 32);
            }
            System.out.print(changedLetter);
        }
    }
}
