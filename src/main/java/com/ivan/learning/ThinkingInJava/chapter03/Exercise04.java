package com.ivan.learning.ThinkingInJava.chapter03;

// Для статичных значений дистанции и времени рассчитать скорость передвижения

public class Exercise04 {
    private static class Parameters {
        private static final int distance = 1000;
        private static final int time = 40;
    }

    public static void main(String[] args) {
        System.out.println("Скорость передвижения: " + Parameters.distance / Parameters.time);

    }
}
