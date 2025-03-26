package com.ivan.learning.ThinkingInJava.chapter04;

// Изменить код, использую тренарный оператор и поразрядную проверку для вывода нулей и единиц

public class Exercise05 {
    public static void main(String[] args) {
        int number1 = 0x84A;
        int number2 = -0x74F;

        System.out.print("number1: ");
        for (int i = 31; i >= 0; i--) {
            System.out.print(((number1 >> i) & 1) == 1 ? "1" : "0");
            if (i % 8 == 0 && i > 0) System.out.print(" ");
        }

        System.out.print("\nnumber2: ");
        for (int i = 31; i >= 0; i--) {
            System.out.print(((number2 >> i) & 1) == 1 ? "1" : "0");
            if (i % 8 == 0 && i > 0) System.out.print(" ");
        }

        System.out.print("\nresult: ");
        int result = (number1 & number2) | (number1 ^ number2);
        for (int i = 31; i >= 0; i--) {
            System.out.print(((result >> i) & 1) == 1 ? "1" : "0");
            if (i % 8 == 0 && i > 0) System.out.print(" ");
        }
    }
}
