package com.ivan.learning.ThinkingInJava.chapter03;

// Минимальное и максимальное экспоненциальное представление для типов float и double

public class Exercise09 {
    public static void main(String[] args) {
        float minFloat = -3.40282347e+38f;
        float maxFloat = 3.40282347e+38f;
        System.out.println("minFloat = " + minFloat);
        System.out.println("maxFloat = " + maxFloat);

        double minDouble = -1.797693134862315708e+308d;
        double maxDouble = 1.797693134862315708e+308d;
        System.out.println("minDouble = " + minDouble);
        System.out.println("maxDouble = " + maxDouble + "\n");
        // P.S. Из-за ограниченной точности IEEE754 числа обрезаются справа при выводе

        // Используем конструкцию -Float.MAX_VALUE, поскольку Float.MIN_VALUE возвращает минимальное положительно число,
        // а нам нужно минимальное отрицательное число
        minFloat = -Float.MAX_VALUE;
        maxFloat = Float.MAX_VALUE;
        System.out.println("minFloat = " + minFloat);
        System.out.println("maxFloat = " + maxFloat);

        // Используем конструкцию -Double.MAX_VALUE, поскольку Double.MIN_VALUE возвращает минимальное положительно число,
        // а нам нужно минимальное отрицательное число
        minDouble = -Double.MAX_VALUE;
        maxDouble = Double.MAX_VALUE;
        System.out.println("minDouble = " + minDouble);
        System.out.println("maxDouble = " + maxDouble);
    }
}
