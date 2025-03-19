package com.ivan.learning.ThinkingInJava.chapter03;

// Начать с числа состоящего из двоичных единиц, сдвинуть его влево,
// а затем использовать беззнаковый оператор сдвига вправо по всем двоичным позициям

public class Exercise12 {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toHexString(number));
        System.out.println(number);

        number <<= 10;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(number);

        number >>>= 1;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(number);

        number >>>= 1;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(number);

        number >>>= 1;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(number);

        number >>>= 1;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(number);
    }
}
