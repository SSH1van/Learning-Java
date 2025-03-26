package com.ivan.learning.ThinkingInJava.chapter05;

// Одну переменную инициализировать при объявлении поля класса, а другую в конструкторе

public class Exercise02 {
    private static class Test {
        private final String name1 = "test1";
        private final String name2;

        Test() {
            name2 = "test2";
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Инициализация при объявлении: " + test.name1);
        System.out.println("Инициализация в конструкторе: " + test.name2);
    }
}
