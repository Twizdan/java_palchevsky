package tasks.kontrolnaya_polsem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker wk = new Worker();

        System.out.println("�������� ������: ");
        System.out.println("��� ��������: " + wk.getName());
        System.out.println("������� ��������: " + wk.getAge());
        System.out.println("�������� ��������: " + wk.getSalary());

        System.out.println("������� ����� ��������");
        System.out.print("������� ����� ��� ��������: ");
        wk.setName(sc.nextLine());
        System.out.print("������� ����� ������� ��������: ");
        wk.setAge(sc.nextInt());
        System.out.print("������� ����� �������� ��������: ");
        wk.setSalary(sc.nextInt());

        System.out.println("����� ������: ");
        System.out.println("��� ��������: " + wk.getName());
        System.out.println("������� ��������: " + wk.getAge());
        System.out.println("�������� ��������: " + wk.getSalary());

    }
}
