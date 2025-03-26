package com.ivan.learning.ThinkingInJava.chapter04;

// Доработать метод test() с определение принадлежности числа заданному интервалу

public class Exercise06 {
    private static int test(int testval, int target, int begin, int end) {
        if (testval <= end && testval >= begin) {
            System.out.printf("Число '%d' НАХОДИТСЯ в диапазоне [%d; %d]%n", testval, begin, end);
        } else {
            System.out.printf("Число '%d' НЕ НАХОДИТСЯ в диапазоне [%d; %d]%n", testval, begin, end);
        }

        if (testval > target) return 1;
        else if (testval < target) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 10, 20));
        System.out.println(test(5, 10, 10, 20));
        System.out.println(test(5, 5, 10, 20));
    }
}
