package com.ivan.learning.ThinkingInJava.chapter03;

// Начать с числа, содержащего в старшем бите 1, использовать знаковый оператор сдвига вправо,
// сдвигать до крайней правой позиции

public class Exercise11 {
    public static void main(String[] args) {
        int number = Integer.MIN_VALUE;
        System.out.println(number);
        System.out.println(Integer.toBinaryString(number));

        number >>= 10;
        System.out.println(Integer.toBinaryString(number));

        number >>= 5;
        System.out.println(Integer.toBinaryString(number));

        number >>= 16;
        System.out.println(Integer.toBinaryString(number));

        System.out.println(Integer.toHexString(number));
        System.out.println(number);
    }
}
