package com.company;

public class MilkProduct extends Product {
    String aliveTime;

    public MilkProduct(int id, String name, int price, int count, String aliveTime) {
        super(id, name, price, count);
        this.aliveTime = aliveTime;
    }
}
