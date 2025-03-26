package com.ivan.learning.ThinkingInJava.chapter04;

// Нахождение чисел вампиров, примеры:
// 1260 = 21 * 60
// 1827 = 21 * 87
// 2187 = 27 * 81

public class Exercise10 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                int result = i * j;
                String resultString = Integer.toString(result);
                String iLeftString = String.valueOf(Integer.toString(i).charAt(0));
                String iRightString = String.valueOf(Integer.toString(i).charAt(1));
                String jLeftString = String.valueOf(Integer.toString(j).charAt(0));
                String jRightString = String.valueOf(Integer.toString(j).charAt(1));

                resultString = resultString.replaceFirst(iLeftString, "");
                resultString = resultString.replaceFirst(iRightString, "");
                resultString = resultString.replaceFirst(jLeftString, "");
                resultString = resultString.replaceFirst(jRightString, "");

                if (resultString.isEmpty() && Integer.toString(result).length() == 4) {
                    System.out.printf("%d * %d = %d%n", i, j, result);
                }
            }
        }
    }
}
