package com.test.sql.ten;

public class Student extends Result1 {
    private final int Student_ID;
    private final String Student_Direction;
    private final String Student_FIO;
    private final String Student_Group;

    public Student(int Student_ID, String Student_Direction, String Student_FIO, String Student_Group) {
        this.Student_ID = Student_ID;
        this.Student_Direction = Student_Direction;
        this.Student_FIO = Student_FIO;
        this.Student_Group = Student_Group;
    }

    public void Test() {
        System.out.println("" + this + " �������!");
    }

    public String toString() {
        return "ID �������� " + this.Student_ID + ", ����������� ���������� �������� " + this.Student_Direction + ", ��� �������� " + this.Student_FIO + ", ������ �������� " + this.Student_Group;
    }
}