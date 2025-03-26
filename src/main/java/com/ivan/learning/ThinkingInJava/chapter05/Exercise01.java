package com.ivan.learning.ThinkingInJava.chapter05;

// Создать класс с неинициализированной ссылкой String, показать вывод и автоматическую инициализацию в Java

public class Exercise01 {
    private static class Test {
        private String name;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.name);
    }
}
