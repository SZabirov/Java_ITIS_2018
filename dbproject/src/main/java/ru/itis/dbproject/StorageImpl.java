package ru.itis.dbproject;

import java.sql.*;
import java.util.List;

public class StorageImpl implements Storage {
    private Connection connection;

    public StorageImpl() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/product_db",
                "postgres",
                "postgres");
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public Product getById(int id) throws SQLException {
        String sqlQuery = "SELECT * FROM product WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sqlQuery);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        rs.next();
        String name = rs.getString("name");
        int price = rs.getInt("price");
        int count = rs.getInt("count");
        Product product = new Product(id, name, price, count);
        return product;
    }
}
