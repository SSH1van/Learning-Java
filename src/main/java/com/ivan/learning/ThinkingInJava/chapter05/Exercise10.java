package com.ivan.learning.ThinkingInJava.chapter05;

// Создать класс с методом finalize(), который выводит сообщение
// В методе main создать экземпляр класса

// В новых версиях Java метод finalize() не используется
// В текущей реализации метод не вызывается, поскольку программа завершается слишком быстро,
// также GC не гарантирует вызов метода

public class Exercise10 {
    private static class Test {
        protected void finalize() {
            System.out.println("Очистил память");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}