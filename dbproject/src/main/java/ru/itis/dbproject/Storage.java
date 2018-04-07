package ru.itis.dbproject;

import java.sql.SQLException;
import java.util.List;

public interface Storage {
    /**
     * Возвращает все продукты из таблицы Product
     * @return список продуктов
     */
    List<Product> getAllProducts();

    /**
     * Возвращает продукт по его id
     * @param id идентификатор продукта
     * @return продукт
     */
    Product getById(int id) throws SQLException;
}
