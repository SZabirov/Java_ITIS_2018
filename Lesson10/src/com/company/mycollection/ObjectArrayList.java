package com.company.mycollection;

public class ObjectArrayList {
    private Object[] array;
    private int capacity;
    private int count;

    public ObjectArrayList() {
        capacity = 10;
        count = 0;
        array = new Object[capacity];
    }

    public void add(Object s) {
        if (count < capacity) {
            array[count] = s;
            count++;
        } else {
            Object[] newArray = new Object[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public Object get(int id) {
        if (id >= 0 & id < count) {
            return array[id];
        } else {
            return null;
        }
    }

    void size() {

    }
}
