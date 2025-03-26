package com.ivan.learning.ThinkingInJava.chapter05;

// В методе вызвать другой метод с и без ключевого слова this

public class Exercise08 {
    private static class Test {
        private void callingPrintMethod() {
            printMessage();
            this.printMessage();
        }

        private void printMessage() {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.callingPrintMethod();
    }
}
