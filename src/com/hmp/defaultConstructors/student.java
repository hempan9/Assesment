/**
 * Assignment 2.5
 */
package com.hmp.defaultConstructors;

public class student {
    private int studentId;
    private char studentType;
    public student(){
        studentId = 10;
        studentType='F';
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public static void main(String[] args) {
        student Student = new student();
        //using default constructor
        System.out.println("Student id is: "+Student.getStudentId()+" and type is: "+Student.getStudentType());
        Student.setStudentId(29);
        Student.setStudentType('F');
        System.out.println("Student id is: "+Student.getStudentId()+" and type is: "+Student.getStudentType());


    }
}
