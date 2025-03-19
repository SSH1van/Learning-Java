package com.ivan.learning.ThinkingInJava.chapter03;

// Дополнить задание 5 созданием новой ссылки Dog, присвоением её для spot. Сравнить ссылки через == и equals

public class Exercise06 {
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
        System.out.println(scruffy.name + " говорит: " + scruffy.says + "\n");

        Dog newDog;
        newDog = spot;

        System.out.println("Сравнение с '==' " + (newDog == spot));
        System.out.println("Сравнение с 'equals' " + spot.equals(newDog));
    }
}
