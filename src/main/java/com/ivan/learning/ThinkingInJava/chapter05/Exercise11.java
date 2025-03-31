package com.ivan.learning.ThinkingInJava.chapter05;

// Доработать предыдущее упражнение, чтобы метод finalize() всегда вызывался

public class Exercise11 {
    private static class Test {
        protected void finalize() {
            System.out.println("Очистил память");
        }
    }

    public static void main(String[] args) {
        new Test(); // Теряем ссылку
        System.gc(); // Запрашиваем сборку мусора
    }
}
