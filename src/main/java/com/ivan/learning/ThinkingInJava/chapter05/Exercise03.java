package com.ivan.learning.ThinkingInJava.chapter05;

// Создать класс с конструктором по умолчанию с выводом сообщения, создать объект класса

public class Exercise03 {
    private static class Test {
        Test() {
            System.out.println("Hello. world!");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
