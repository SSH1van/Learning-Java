package com.ivan.learning.ThinkingInJava.chapter04;

// Доработать Exercise01 выходом через return

public class Exercise07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) return;
        }
    }
}
