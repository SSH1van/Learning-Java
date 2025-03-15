package com.ivan.learning.ThinkingInJava.chapter02;

/* Изменить данные класса из Exercise04 и вывести их */

public class Exercise05 {
    private static class DataOnly {
        int i = 20;
        double d = 5.1;
        boolean b = true;
    }

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 47;
        dataOnly.d = 1.1;
        dataOnly.b = false;

        System.out.println("Целочисленное: " + dataOnly.i + "\nВещественное: " + dataOnly.d + "\nЛогическое: " + dataOnly.b);
    }
}
