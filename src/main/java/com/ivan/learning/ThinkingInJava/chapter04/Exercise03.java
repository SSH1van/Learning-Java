package com.ivan.learning.ThinkingInJava.chapter04;

// Доработать упражнение 2, чтобы числа генерировать в бесконечном цикле while

import java.util.Random;

public class Exercise03 {
    public static void main(String[] args) {
        Random random = new Random();

        int rememberNumber = random.nextInt(1, 11);
        while (true) {
            int number = random.nextInt(1, 11);

            if (number > rememberNumber) {
                System.out.printf("Число '%d' больше '%d'%n", number, rememberNumber);
            } else if (number < rememberNumber) {
                System.out.printf("Число '%d' меньше '%d'%n", number, rememberNumber);
            } else {
                System.out.printf("Числа '%d' и '%d' равны%n", number, rememberNumber);
            }

            rememberNumber = number;
        }
    }
}
