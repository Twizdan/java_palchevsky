package com.test.idea;

import java.util.Scanner;

public class All extends Worker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Worker sub1 = new Worker();
        int Age = sub1.getAge();
        String Name = sub1.getName();
        int Salary = sub1.getSalary();
        System.out.println("Имя сотрудника = " + Name);
        System.out.println("Возраст сотрудника = " + Age);
        System.out.println("Зарплата сотрудника = " + Salary);

    }
}
