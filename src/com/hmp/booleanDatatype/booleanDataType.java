/**
 * Assignment 1.7
 */
package com.hmp.booleanDatatype;

public class booleanDataType {
    public static void main(String[] args) {
        boolean bool1 = false;
        boolean bool2 = true;
        boolean bool3 = true;
        if (bool1 || (bool1 ||(bool2=true ))) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        System.out.println("bool2 value: " + bool2);
    }
}
