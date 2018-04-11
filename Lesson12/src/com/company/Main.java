package com.company;

public class Main {

    public static void main(String[] args) {
//        try {
//            int s = rectangleSquare(-1, -3);
//            System.out.println(s);
//        } catch (RectangleParameterException exc) {
//            System.out.println("Че-то пошло не так, лень разбираться :)");
//        }
        System.out.println(loginIsOk(null));
    }

    static int rectangleSquare(int width, int height) throws RectangleParameterException {
        if (width > 0 && height > 0) {
            return width * height;
        } else {
            RectangleParameterException e = new RectangleParameterException("Некорректные width = " + width + " и height = " + height);
            throw e;
        }
    }

    static boolean loginIsOk(String login) {
        if (login != null & login.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
