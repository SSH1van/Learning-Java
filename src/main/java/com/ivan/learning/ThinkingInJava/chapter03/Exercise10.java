package com.ivan.learning.ThinkingInJava.chapter03;

// Две константы объединить побитными операторами & | ^

public class Exercise10 {
    public static void main(String[] args) {
        int number1 = 0xAB84A;
        int number2 = 0xFF74F;
        System.out.println("number1: " + Integer.toBinaryString(number1));
        System.out.println("number1: " + Integer.toBinaryString(number2));

        int result = (number1 & number2) | (number1 ^ number2);
        System.out.println("result: " + Integer.toBinaryString(result));
    }
}
