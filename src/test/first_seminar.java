package test;


import java.util.Scanner;

public class first_seminar {
    public static void main (String[] test) {

        byte a = 10;
        byte b = 20;
        byte c = 30;

        System.out.println("Байтовые значения a: " + a);
        System.out.println("Байтовые значения b: " + b);
        System.out.println("Байтовые значения c: " + c);

        short d = 500;
        System.out.println("Значение d: " + d);

        int e = 1000;
        System.out.println("Значение e: " + e);

        long f = 989233333357890987L;
        System.out.println("Значение f: " + f);

        byte x = (byte) (a + b + c);
        System.out.println("Сумма:" + x);

        byte z = (byte) (a-b-c);
        System.out.println("Разность: " + z);

        byte l = (byte) (a*b*c);
        System.out.println("Произведение: " + l);

        byte l1 = (byte) (a / b / c);
        System.out.println("Частное: " + l1);

        byte l2 = (byte) (-a / b / c);
        System.out.println("Частное: " + l2);

        byte l3 = (byte) (Math.abs(a));
        System.out.println("Модуль: " + l3);

        byte l4 = (byte) (Math.pow(a, 2));
        System.out.println("Число в степени: " + l4);

        int l5 = 90;
        int l6 = 100;
        System.out.println("Результат сравнения чисел: " + (l5==l6));

        Scanner enter_user = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String m = enter_user.nextLine();
        System.out.println(m);

        float k = 12.7333f;
        double k1 = 12.89273410298374214028;
        System.out.println(k + k1);
    }
}
