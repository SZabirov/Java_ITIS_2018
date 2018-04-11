package com.company.birds;

public class Bird {
    private String name;
    private boolean isInCell;

    public Bird(String name, boolean isInCell) {
        this.name = name;
        this.isInCell = isInCell;
    }

    boolean feed() {
        if (isInCell) {
            System.out.println("Птица " + name + " покормелена");
            return true;
        } else {
            System.out.println("Птица " + name + " отсутствует, на сегодня без еды");
            return false;
        }
    }
}
