package com.ivan.learning.ThinkingInJava.chapter03;

// Создать класс с полем типа float для демонстрации совмещения имён

public class Exercise02 {
    private static class Temperature {
        private float value;
    }

    public static void main(String[] args) {
        Temperature temperature1 = new Temperature();
        Temperature temperature2 = new Temperature();

        temperature1.value = 36.6f;
        temperature2.value = 38.2f;

        System.out.println("temperature1: " + temperature1.value);
        System.out.println("temperature2: " + temperature2.value + "\n");

        temperature1 = temperature2;

        System.out.println("temperature1: " + temperature1.value);
        System.out.println("temperature2: " + temperature2.value + "\n");

        temperature1.value = 40.2f;

        System.out.println("temperature1: " + temperature1.value);
        System.out.println("temperature2: " + temperature2.value);
    }
}
