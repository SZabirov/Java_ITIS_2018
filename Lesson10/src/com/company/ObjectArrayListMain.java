package com.company;

import com.company.mycollection.ObjectArrayList;

public class ObjectArrayListMain {
    public static void main(String[] args) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        objectArrayList.add(new Product(1, "1", 1, 1));
        Product p = (Product) objectArrayList.get(0);
    }
}
