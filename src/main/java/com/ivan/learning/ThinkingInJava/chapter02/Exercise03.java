package com.ivan.learning.ThinkingInJava.chapter02;

/* Сделать класс ATypeName работающим */

public class Exercise03 {
    private static class ATypeName {
        String name = "ATypeName";
    }

    public static void main(String[] args) {
        ATypeName typeName = new ATypeName();
        System.out.println(typeName.name);
    }
}
