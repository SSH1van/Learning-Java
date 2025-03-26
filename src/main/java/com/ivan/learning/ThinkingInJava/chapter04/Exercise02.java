package com.ivan.learning.ThinkingInJava.chapter04;

// Сгенерировать 25 чисел и сравнивать текущее число с предыдущим на >, < или ==

import java.util.Random;

public class Exercise02 {
    public static void main(String[] args) {
        Random random = new Random();

        int rememberNumber = random.nextInt(1, 11);
        for (int i = 0; i < 24; i ++) {
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
