package com.ivan.learning.ThinkingInJava.chapter05;

// Дополнить предыдущее упражнение перегруженным конструктором

public class Exercise04 {
    private static class Test {
        Test() {
            System.out.println("Hello. world!");
        }

        Test(String text) {
            System.out.printf("Hello, %s!", text);
        }
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test("Ivan");
    }
}
