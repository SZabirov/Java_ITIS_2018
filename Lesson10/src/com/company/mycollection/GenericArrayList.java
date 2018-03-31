package com.company.mycollection;

public class GenericArrayList<T> {
    private T[] array;
    private int capacity;
    private int count;

    public GenericArrayList() {
        capacity = 10;
        count = 0;
        array = (T[]) new Object[capacity];
    }

    public void add(T s) {
        if (count < capacity) {
            array[count] = s;
            count++;
        } else {
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < capacity; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public T get(int id) {
        if (id >= 0 & id < count) {
            return array[id];
        } else {
            return null;
        }
    }

    void size() {

    }
}
