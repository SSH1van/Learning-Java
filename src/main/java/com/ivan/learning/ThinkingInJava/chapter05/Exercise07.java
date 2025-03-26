package com.ivan.learning.ThinkingInJava.chapter05;

// Создать класс без конструктора, создать его объект, удостоверится,
// что конструктор по умолчанию создаётся автоматически

public class Exercise07 {
    private static class Test {}

    public static void main(String[] args) {
        Test test = new Test();
    }
}
