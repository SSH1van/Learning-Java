package com.ivan.learning.ThinkingInJava.chapter05;

// Создать класс Dog с перегруженным методом bark() для разных типов данных

public class Exercise05 {
    private static class Dog {
        private void bark() {
            System.out.println("Гав!");
        }

        private void bark(String text) {
            System.out.printf("Собака гавкает: %s!%n", text);
        }

        private void bark(char symbol) {
            System.out.printf("Собака издаёт звук: %c!%n", symbol);
        }

        private void bark(int volume) {
            System.out.printf("Собака гавкнула с громкостью: %d%n", volume);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark("гыв");
        dog.bark('г');
        dog.bark(130);
    }
}
