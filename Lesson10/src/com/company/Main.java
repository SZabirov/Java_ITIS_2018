package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();
        Product p1 = new Product(1, "хлеб", 20, 25);
        Product p2 = new Product(1, "молоко", 30, 20);
        list.add(p1);
        list.add(p2);
        for (Product p : list) {
            System.out.println(p.name);
        }


    }
}
