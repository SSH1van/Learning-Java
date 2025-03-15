package com.ivan.learning.ThinkingInJava.chapter02;

/* Пример с классом AllTheColorsOfTheRainbow сделать работающим */

public class Exercise11 {
    private static class AllTheColorsOfTheRainbow {
        int anIntegerRepresentingColors = 10;
        void changeTheHueOfTheColor(int newHue) {
            anIntegerRepresentingColors = newHue;
        }

    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        System.out.println(rainbow.anIntegerRepresentingColors);

        rainbow.changeTheHueOfTheColor(40);
        System.out.println(rainbow.anIntegerRepresentingColors);

        rainbow.changeTheHueOfTheColor(20);
        System.out.println(rainbow.anIntegerRepresentingColors);
    }
}
