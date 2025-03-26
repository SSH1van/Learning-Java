package com.ivan.learning.ThinkingInJava.chapter03;

// Метод, который получает два объекта String, выполняет с ними все операции логических сравнений и выводит результат
// Для == и != выполнить проверку через equals()

public class Exercise14 {
    private static void logicalComparison(String s1, String s2) {
        System.out.printf("Результаты для '%s' и '%s'%n", s1, s2);
        System.out.println("== (сравнение ссылок): " + (s1 == s2));
        System.out.println("!= (сравнение ссылок): " + (s1 != s2));
        System.out.println("equals (сравнение содержимого): " + s1.equals(s2));
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "Привет";
        logicalComparison("Привет", "Привет");
        logicalComparison("Привет", "привет");
        logicalComparison("Привет", "тевирП");
        logicalComparison(s, s);
    }
}
