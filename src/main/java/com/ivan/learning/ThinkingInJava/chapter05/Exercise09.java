package com.ivan.learning.ThinkingInJava.chapter05;

// Класс с двумя перегруженными конструкторами, из одного вызвать другой конструктор

public class Exercise09 {
    private static class Test {
        Test(String text) {
            this(text.charAt(0));
            System.out.println(text);
        }

        Test(char symbol) {
            System.out.println(symbol);
        }
    }

    public static void main(String[] args) {
        Test test = new Test("Hello!");
    }
}
