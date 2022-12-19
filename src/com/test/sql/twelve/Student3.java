package com.test.sql.twelve;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Student3 extends Result2 {
    private final int Student_ID;
    private final String Student_Direction;
    private final String Student_FIO;
    private final String Student_Group;

    public Student3(int Student_ID, String Student_Direction, String Student_FIO, String Student_Group) {
        this.Student_ID = Student_ID;
        this.Student_Direction = Student_Direction;
        this.Student_FIO = Student_FIO;
        this.Student_Group = Student_Group;
    }

    public ArrayList<String> Sort() {
        ArrayList<String> arr = new ArrayList(Arrays.asList(this.Student_FIO));
        return arr;
    }

    public abstract ArrayList<String> Sort(ArrayList<String> var1);
}