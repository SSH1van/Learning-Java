package com.ivan.learning.ThinkingInJava.chapter02;

/* Использовать метод storage(String s) для определения занимаемого места в памяти в байтах */

public class Exercise06 {
    private int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Exercise06 exercise = new Exercise06();
        System.out.println(exercise.storage("Hello"));
    }
}
