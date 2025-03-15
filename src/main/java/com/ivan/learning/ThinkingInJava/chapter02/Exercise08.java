package com.ivan.learning.ThinkingInJava.chapter02;

/* Написать программу, которая демонстрирует, что независимо от количества созданных объектов
* класс содержит только один экземпляр поля static */

public class Exercise08 {
    private static class NewClass {
        static String name = "MyName";
    }

    public static void main(String[] args) {
        NewClass nc1 = new NewClass();
        NewClass nc2 = new NewClass();
        System.out.println("nc1: " + nc1.name);
        System.out.println("nc2: " + nc2.name);
        System.out.println("NewClass: " + NewClass.name + "\n");

        NewClass.name = "NewName";
        System.out.println("nc1: " + nc1.name);
        System.out.println("nc2: " + nc2.name);
        System.out.println("NewClass: " + NewClass.name + "\n");

        nc1.name = "AlsoName";
        System.out.println("nc1: " + nc1.name);
        System.out.println("nc2: " + nc2.name);
        System.out.println("NewClass: " + NewClass.name + "\n");
    }
}
