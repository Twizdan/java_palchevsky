package com.test.idea;

public class Worker extends Student{
    private int salary = 1000;

    public int getSalary(){
        return salary;
    }

    public int setSalary(int salary){
        this.salary = salary;
        return salary;
    }

}
