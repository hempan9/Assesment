/**
 * Assignment 2.3
 */
package com.hmp.switchCase;

public class switchCaseStatement {
    public static void main(String[] args) {
        char grade = 'A';
        int marks;
        //incomplete
        switch (grade) {
            case 'A':
                System.out.println("Range is 80-100");
                break;
            case 'B':
                System.out.println("Range is 73-79");
                break;
            case 'C':
                System.out.println("Range is 65-72");
                break;
            case 'D':
                System.out.println("Range is 55-64");
                break;
            case 'E':
                System.out.println("Range is 0-55");
                break;
            default :
                System.out.println("Garde does not exist");
                break;
        }
    }
}
