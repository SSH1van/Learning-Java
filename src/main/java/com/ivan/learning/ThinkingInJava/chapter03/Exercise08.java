package com.ivan.learning.ThinkingInJava.chapter03;

// Шестнадцатеричные и восьмеричные числа с типом Long. Для вывода использовать Long.toBinaryString()

public class Exercise08 {
    public static void main(String[] args) {
        long hex = 0xABL;
        long oct = 04153L;

        System.out.println(Long.toBinaryString(hex));
        System.out.println(Long.toBinaryString(oct));
    }
}
