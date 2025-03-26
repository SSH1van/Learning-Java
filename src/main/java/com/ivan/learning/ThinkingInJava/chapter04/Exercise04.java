package com.ivan.learning.ThinkingInJava.chapter04;

// Программа, два вложенных цикла, оператор остатка %, для поиска и вывода простых чисел

public class Exercise04 {
    public static void main(String[] args) {
        outer:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}
