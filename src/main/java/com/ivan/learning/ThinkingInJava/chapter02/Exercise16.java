package com.ivan.learning.ThinkingInJava.chapter02;

//javadoc -d "Exercise16 javadoc" Exercise16.java

//: initialization/Exercise16.java
// Demonstration of both constructor
// and ordinary method overloading.

/** Planting a seedling
 * @author SSH1van
 * @version 1.0
 */

public class Exercise16 {

    /**
     * height of tree
     */
    int height;

    /**
     * Default constructor
     */
    Exercise16() {
        print("Planting a seedling");
        height = 0;
    }

    /**
     *  Constructor with params
     * @param initialHeight initial height of tree
     */
    Exercise16(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * Display message in console
     * @param message message for display
     */
    private void print(String message) {
        System.out.println(message);
    }

    /**
     * Information about  tree height
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }

    /**
     * Overloaded method
     * @param s additional message
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }

    /** Entry point to class and application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // Overloaded constructor
        for(int i = 0; i < 5; i++) {
            Exercise16 t = new Exercise16(i);
            t.info();
            t.info("overloaded method");
        }
        // Default constructor
        new Exercise16();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
