package com.ivan.learning.ThinkingInJava.chapter02;

/* Создайте класс с полями int и char, которые не инициализируются в программе.
* Выведите их значения, чтобы убедится в том, что Java выполняет инициализацию по умолчанию */

public class Exercise01 {
    static int number;
    static char symbol;

    public static void main(String[] args) {
        System.out.println(number);
        System.out.println(symbol);
    }
}
