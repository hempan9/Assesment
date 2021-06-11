/**
 * Assignment 2.2
 */
package com.hmp.controStatement;

public class controlTwo {
    public static void main(String[] args) {
        boolean bool = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                if (j > 5) {
                    continue;
                }
            }
            System.out.println("Outer loop");
        }
        System.out.println("End");
    }
}
