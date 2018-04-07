package com.company;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Storage storage = new Storage();
//        storage.addProduct(new Product(96, "fakeNote', 34, 72);\n" +
//                "DROP TABLE product;\n" +
//                "INSERT INTO product VALUES (97, 'fakeNote", 34, 72));
        printProducts(storage.getAllProducts());

//        storage.addProduct(new Product(5, "text', 2, 4); SELECT * FROM product; INSERT INTO product VALUES (5, 'text", 2, 4));
//        storage.updateProductName(1, "кефир'; DELETE FROM product; select * from product ' ");
//        Product p1 = storage.getById(1);
//        System.out.println(p1.name);
    }

    static void printProducts(List<Product> list) {
        System.out.println("id| name       |price|count");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).id + " | " + list.get(i).name + " | " + list.get(i).price + " | " + list.get(i).count);
        }
    }
}













