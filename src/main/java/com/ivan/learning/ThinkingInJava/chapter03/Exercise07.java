package com.ivan.learning.ThinkingInJava.chapter03;

// Программа моделирующая бросок монетки

import java.util.Random;

public class Exercise07 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Бросок монеты:");

        if (rand.nextInt(2) == 1) {
            System.out.println("Решка!");
        } else {
            System.out.println("Орёл!");
        }
    }
}
