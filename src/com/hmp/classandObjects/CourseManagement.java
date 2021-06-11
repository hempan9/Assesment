/**
 * Assignment 2.4
 */
package com.hmp.classandObjects;

public class CourseManagement {
    public static void main(String[] args) {
        student sam = new student();
        sam.setStudentId(23);
        sam.setStudentType('M');
        System.out.println("Student ID is " + sam.getStudentId());
        System.out.println("Student type is: " + sam.getStudentType());
    }
}
