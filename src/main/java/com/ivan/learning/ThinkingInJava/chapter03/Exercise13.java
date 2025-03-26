package com.ivan.learning.ThinkingInJava.chapter03;

// Метод для вызова char в двоичном представлении, разные символы

public class Exercise13 {
    private static void binaryChar(char symbol) {
        System.out.println(Integer.toBinaryString((byte)symbol));
    }

    public static void main(String[] args) {
        binaryChar('a');
        binaryChar('b');
        binaryChar('c');
    }
}
