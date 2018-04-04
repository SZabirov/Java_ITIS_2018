package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    Connection connection;

    public Storage() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/product_db",
                "postgres",
                "postgres");
    }

    List<Product> getAllProducts() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM product");
        List<Product> productList = new ArrayList<Product>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product p = new Product(id, name, price, count);
            productList.add(p);
        }
        return productList;
    }

    Product getById(int id) throws SQLException {
        Statement statement = connection.createStatement();
        String sqlQuery = "SELECT * FROM product WHERE id = " + id;
        System.out.println(sqlQuery);
        ResultSet rs = statement.executeQuery(sqlQuery);
        rs.next();
        String name = rs.getString("name");
        int price = rs.getInt("price");
        int count = rs.getInt("count");
        Product product = new Product(id, name, price, count);
        return product;
    }

    void updateProductName(int id, String name) throws SQLException {
        Statement statement = connection.createStatement();
        String sqlQuery = "UPDATE product SET name = '" + name +
                "' WHERE id = " + id;
        System.out.println(sqlQuery);
        statement.executeUpdate(sqlQuery);
    }
}















