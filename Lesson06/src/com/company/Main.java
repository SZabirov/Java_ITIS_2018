package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        printNameWithCount();
        System.out.println();

        int count = countOfProducts();
        System.out.println("Суммарное количество продуктов: " + count);
        System.out.println("Стоимость продукта с id = 2: " + getCost(2));
        System.out.println();

        int id = 1;
        buy(id);
        System.out.println("Был куплен продукт с id = " + id);
        System.out.println();

        System.out.println("Количество продуктов на складе:");
        printNameWithCount();

//        delete(3);
//        System.out.println("Удален 3 эл-т");

//        changePrice(4, 120);

        add(7, "бублики", 50, 8, "Хлебзавод 2", 5);
    }

    static void printNameWithCount() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] arr = str.split(", ");
            System.out.println(arr[1] + ": " + arr[3] + " шт.");
        }
    }

    static int countOfProducts() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        int count = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] arr = str.split(", ");
            count += Integer.parseInt(arr[3]);
        }
        return count;
    }

    /**
     * Возвращает стоимость конкретного продукта
     * @param id идентификатор продукта
     * @return стоимость продукта или -1, если такой продукт не найде
     * @throws FileNotFoundException в случае, если файл не найден
     */
    static int getCost (int id) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] arr = str.split(", ");
            if (Integer.parseInt(arr[0]) == id) {
                int cost = Integer.parseInt(arr[2]);
                return cost;
            }
        }
        return -1;
    }

    static void buy (int id) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        String[] products = new String[countOfItems()];
        int i = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            products[i] = str;
            i++;
        }
        for (int j = 0; j < products.length; j++) {
            String[] arr = products[j].split(", ");
            if (Integer.parseInt(arr[0]) == id) {
                int productCount = Integer.parseInt(arr[3]);
                productCount--;
                products[j] = arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + productCount;
            }
        }
        PrintWriter pw = new PrintWriter(new FileOutputStream("products.txt"));
        for (int j = 0; j < products.length; j++) {
            pw.println(products[j]);
        }
        pw.close();
    }

    static int countOfItems() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        int count = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }
        return count;
    }

    /**
     * Удаляет полностью запись о продукте
     * @param id идентификатор продукта для удаления
     */
    static void delete(int id) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        int n = countOfItems();
        String[] products = new String[n];
        int i = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            products[i] = str;
            i++;
        }
        PrintWriter pw = new PrintWriter(new FileOutputStream("products.txt"));
        for (int j = 0; j < n; j++) {
            String s = products[j];
            String[] elements = s.split(", ");
            if (Integer.parseInt(elements[0]) != id) {
                pw.println(s);
            }
        }
        pw.close();
    }

    /**
     * Заменяет цену продукта
     * @param id идентификатор продукта
     * @param price новая цена продукта
     */
    static void changePrice(int id, int price) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("products.txt"));
        int n = countOfItems();
        String[] products = new String[n];
        int i = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            products[i] = str;
            i++;
        }
        PrintWriter pw = new PrintWriter(new FileOutputStream("products.txt"));
        for (int j = 0; j < n; j++) {
            String s = products[j];
            String[] elements = s.split(", ");
            if (Integer.parseInt(elements[0]) != id) {
                pw.println(s);
            } else {
                elements[2] = String.valueOf(price);
                s = elements[0] + ", " + elements[1] + ", " + elements[2] + ", " + elements[3];
                pw.println(s);
            }
        }
        pw.close();
    }

    /**
     * Возвращает id самого дорогого продукта, который присутствует на складе
     * @return идентификатор такого продукта
     */
    static int getMostExpensiveProductId() {
        return -1;
    }

    static void add (int id, String name, int price, int count, String factory, int days) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("products.txt", true));
        pw.println(id + ", " + name + ", " + price + ", " + count + ", " + factory);
        pw.close();
    }
}
