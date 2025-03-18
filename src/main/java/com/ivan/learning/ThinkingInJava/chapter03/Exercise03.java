package com.ivan.learning.ThinkingInJava.chapter03;

// Создать класс с полем float для демонстрации совмещения имён при вызове метода

public class Exercise03 {
    private static class Temperature {
        private float value;
    }

    private static void increment(Temperature temperature) {
        temperature.value++;
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        temperature.value = 36.6f;
        System.out.println(temperature.value);
        increment(temperature);
        System.out.println(temperature.value);
    }
}
