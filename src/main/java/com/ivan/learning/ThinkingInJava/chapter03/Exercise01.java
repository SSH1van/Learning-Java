package com.ivan.learning.ThinkingInJava.chapter03;

// Короткие и длинные команды для печати

public class Exercise01 {
    private static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        String text = "Hello, world!";
        System.out.println(text);
        print(text);
    }
}
