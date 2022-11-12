package tasks.kontrolnaya_polsem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker wk = new Worker();

        System.out.println("Исходные данные: ");
        System.out.println("Имя студента: " + wk.getName());
        System.out.println("Возраст студента: " + wk.getAge());
        System.out.println("Зарплата студента: " + wk.getSalary());

        System.out.println("Введите новые значения");
        System.out.print("Введите новое имя студента: ");
        wk.setName(sc.nextLine());
        System.out.print("Введите новый возраст студента: ");
        wk.setAge(sc.nextInt());
        System.out.print("Введите новую зарплату студента: ");
        wk.setSalary(sc.nextInt());

        System.out.println("Новые данные: ");
        System.out.println("Имя студента: " + wk.getName());
        System.out.println("Возраст студента: " + wk.getAge());
        System.out.println("Зарплата студента: " + wk.getSalary());

    }
}
