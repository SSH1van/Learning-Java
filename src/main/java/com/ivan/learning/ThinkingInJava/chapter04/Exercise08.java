package com.ivan.learning.ThinkingInJava.chapter04;

// Через цикл перебирать значением, switch использовать для определения текущего значения, попробовать убрать break

public class Exercise08 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i = " + i);
                    //break;
                case 1:
                    System.out.println("i = " + i);
                    //break;
                case 2:
                    System.out.println("i = " + i);
                    //break;
                case 3:
                    System.out.println("i = " + i);
                    //break;
                case 4:
                    System.out.println("i = " + i);
                    //break;
            }
        }
    }
}
