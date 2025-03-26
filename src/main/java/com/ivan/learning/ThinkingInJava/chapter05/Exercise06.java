package com.ivan.learning.ThinkingInJava.chapter05;

// Изменить предыдущее, чтобы два перегруженных метода отличались только порядком следования аргументов

public class Exercise06 {
    private static class Dog {
        private void bark() {
            System.out.println("Гав!");
        }

        private void bark(String text, char symbol) {
            System.out.printf("Собака гавкает: %s! И издаёт звук: %c!%n", text, symbol);
        }

        private void bark(char symbol, String text) {
            System.out.printf("Собака издаёт звук: %c! И гавкает: %s!%n", symbol, text);
        }

        private void bark(int volume) {
            System.out.printf("Собака гавкнула с громкостью: %d%n", volume);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark("гыв", 'г');
        dog.bark('р', "рав");
        dog.bark(130);
    }
}
