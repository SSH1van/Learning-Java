package com.ivan.learning.ThinkingInJava.chapter02;

// javadoc -d "Exercise12 javadoc" Exercise12.java

//: object/Exercise12.java
import java.util.*;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */

public class Exercise12 {
    /** Entry point to class and application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
Hello, it's:
Wed Oct 05 14:39:36 MDT 2005
*/
