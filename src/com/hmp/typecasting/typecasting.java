/**
 * Assignment 2.1 and 1.8
 */
package com.hmp.typecasting;

public class typecasting {

    public static void main(String[] args) {
        int intVal = 100;
        byte byteVal = (byte) intVal;
        byte max = 127;
        byte min = -128;
        byte sum = (byte) (max + min);
        System.out.println("Sum= " + sum);
    }
}


