package com.ivan.learning.ThinkingInJava.chapter04;

// Числа Фибоначчи

public class Exercise09 {
    private static void printFibonacciNumbers(int count) {
        int first = 1;
        int second = 1;

        System.out.print(first);

        if (count > 1) {
            System.out.print(", " + second);
            for (int i = 2; i < count; i++) {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacciNumbers(1);
        printFibonacciNumbers(2);
        printFibonacciNumbers(3);
        printFibonacciNumbers(4);
        printFibonacciNumbers(10);
    }
}
