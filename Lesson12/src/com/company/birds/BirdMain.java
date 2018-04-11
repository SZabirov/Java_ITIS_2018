package com.company.birds;

public class BirdMain {
    public static void main(String[] args) {
        Bird b1 = new Bird("Кеша", false);
        Bird b2 = new Bird("Пушок", true);
        if (b1.feed() && b2.feed()) {
            System.out.println("Все птицы покормлены, я пошел пить чай!");
        }
    }
}
