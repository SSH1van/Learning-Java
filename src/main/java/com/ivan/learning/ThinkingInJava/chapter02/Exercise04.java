package com.ivan.learning.ThinkingInJava.chapter02;

/* Сделать класс DataOnly работающим */

public class Exercise04 {
    private static class DataOnly {
        int i = 20;
        double d = 5.1;
        boolean b = true;
    }

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.println("Целочисленное: " + dataOnly.i + "\nВещественное: " + dataOnly.d + "\nЛогическое: " + dataOnly.b);
    }
}
