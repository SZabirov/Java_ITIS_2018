package com.company.mycollection;

public class ArrayList {
    private String[] array;
    private int capacity;
    private int count;

    public ArrayList() {
        capacity = 10;
        count = 0;
        array = new String[capacity];
    }

    public void add(String s) {
        if (count < capacity) {
            array[count] = s;
            count++;
        } else {
            String[] newArray = new String[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public String get(int id) {
        if (id >= 0 & id < count) {
            return array[id];
        } else {
            return null;
        }
    }

    void size() {

    }
}
