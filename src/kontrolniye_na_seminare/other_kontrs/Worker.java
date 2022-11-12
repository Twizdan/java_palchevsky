package kontrolniye_na_seminare.other_kontrs;

import kontrolniye_na_seminare.other_kontrs.Student;

public class Worker extends Student {
    private int salary = 1000;

    public int getSalary(){
        return salary;
    }

    public int setSalary(int salary){
        this.salary = salary;
        return salary;
    }

}
