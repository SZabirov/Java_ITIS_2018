package ru.itis.dbproject;

//Брюс Эккель. Философия Java. Исключения
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Storage storage = new StorageImpl();
        storage.getById(25);
    }

    void printProducts(List<Product> list) {
        for(Product p : list) {
            System.out.println(p);
        }
    }
}
