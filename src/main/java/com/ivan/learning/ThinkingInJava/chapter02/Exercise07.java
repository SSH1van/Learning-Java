package com.ivan.learning.ThinkingInJava.chapter02;

/* Фрагменты кода с Incrementable сделать рабочими */

public class Exercise07 {
    private static class StaticTest {
        int i = 47;
    }

    private static class Incrementable {
        static void increment(StaticTest st) {
            st.i++;
        }
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        System.out.println(st1.i);
        Incrementable.increment(st1);
        System.out.println(st1.i);
    }
}
