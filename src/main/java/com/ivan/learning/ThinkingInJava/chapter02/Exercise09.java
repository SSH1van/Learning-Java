package com.ivan.learning.ThinkingInJava.chapter02;

/* Автоматическая упаковка примитивов и распаковка объекта */

public class Exercise09 {
    public static void main(String[] args) {
        int primitiveInt1 = 1;
        Integer wrappedInt1 = primitiveInt1;
        System.out.println(wrappedInt1);

        Integer wrappedInt2 = 20;
        int primitiveInt2 = wrappedInt2;
        System.out.println(primitiveInt2);
    }
}
