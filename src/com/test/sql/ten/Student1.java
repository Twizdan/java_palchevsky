package com.test.sql.ten;

public class Student1 extends Student {
    public Student1(int Student_ID, String Student_Direction, String Student_FIO, String Student_Group) {
        super(Student_ID, Student_Direction, Student_FIO, Student_Group);
    }

    public void Test() {
        System.out.println("" + this + " ?????????!");
    }
}
