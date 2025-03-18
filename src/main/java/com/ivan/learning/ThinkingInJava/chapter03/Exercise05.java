package com.ivan.learning.ThinkingInJava.chapter03;

// Создать два объекта класса Dog с полями name и says, задать значения и вывести их

public class Exercise05 {
    private static class Dog {
        private String name;
        private String says;
    }

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "Spot";
        scruffy.name = "Scruffy";

        spot.says = "woof";
        scruffy.says = "ruff";

        System.out.println(spot.name + " говорит: " + spot.says);
        System.out.println(scruffy.name + " говорит: " + scruffy.says);
    }
}
