package com.test.sql.twelve;

import java.util.ArrayList;
import java.util.Collections;

public class Student4 extends Student3 {
    public Student4(int Student_ID, String Student_Direction, String Student_FIO, String Student_Group) {
        super(Student_ID, Student_Direction, Student_FIO, Student_Group);
    }

    public ArrayList<String> Sort(ArrayList<String> arr) {
        Collections.sort(arr);
        return arr;
    }
}