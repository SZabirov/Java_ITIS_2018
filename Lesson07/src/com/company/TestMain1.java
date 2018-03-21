package com.company;

public class TestMain1 {
    public static void main(String[] args) {
        Product p = new Product(1, "Баранки", 42, 56);
        setPriceOne(p);
        System.out.println(p.price);
    }

    static void setPriceOne(Product product) {
        product.price = 1;
    }
}
