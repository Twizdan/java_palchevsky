package tasks.other_kontolnys;

import java.util.Scanner;

//public class task_1 {
//    public static void main (String[] praktikum1) {
//        Scanner first_in = new Scanner(System.in);
//        System.out.print("������� ������ ����������: ");
//        byte first = first_in.nextByte();
//
//        Scanner second_in = new Scanner(System.in);
//        System.out.print("������� ������ ����������: ");
//        int second = second_in.nextInt();
//
//
//        Scanner third_in = new Scanner(System.in);
//        System.out.print("������� ������ ����������: ");
//        float third = third_in.nextFloat();
//
//        System.out.println(first+second+third);
//        System.out.println(first-second+third);
//        System.out.println(first*second+third);
//        System.out.println(first/second/third);
//        System.out.println(first%second%third);
//        System.out.println(Math.abs(first) + Math.abs(second) + Math.abs(third));
//        System.out.println(Math.pow(first, 2) + Math.pow(second, 2) + Math.pow(third, 2));
//    }
//}

// ������ #2
//public class task_1 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        System.out.println(a);
//        System.out.println(a.length());
//        System.out.println(b);
//        System.out.println(b.length());
//        System.out.println(a+b);
//        boolean diff = (a.equals(b));
//        System.out.println(diff);
//    }
//}


// ������ #3
//public class task_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        if (a % 1 == 0) {
//            if (a % 2 == 0) System.out.println("������ ����� ������");
//            else System.out.println("������ ����� ��������");
//        }
//        else {
//            System.out.println("��������� ����� �� �����");
//        }
//        if (b % 1 == 0) {
//            if (b % 2 == 0) System.out.println("������ ����� ������");
//            else System.out.println("������ ����� ��������");
//        }
//        else {
//            System.out.println("��������� ����� �� �����");
//        }
//        if (c % 1 == 0) {
//            if (c % 2 == 0) System.out.println("������ ����� ������");
//            else System.out.println("������ ����� ��������");
//        }
//        else {
//            System.out.println("��������� ����� �� �����");
//        }
//    }
//}


// ������ #4
//public class task_1 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("������� ������� ��� ������, ����� ���������");
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String c = sc.nextLine();
//        System.out.println(a);
//        System.out.println(a.substring(0,4));
//        System.out.println(b);
//        System.out.println(b.substring(3, 6));
//        System.out.println(a.toUpperCase());
//        System.out.println(a.toLowerCase());
//        System.out.println(b.toUpperCase());
//        System.out.println(b.toLowerCase());
//        boolean diff = (a.endsWith(c) || b.endsWith(c));
//        System.out.println(diff);
//    }
//}

//������ #5
public class task_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("������� ��� ������");
        StringBuffer a = new StringBuffer(sc.nextLine());
        StringBuffer b = new StringBuffer(sc.nextLine());
        System.out.println(a);
        System.out.println(b);
        a = a.reverse();
        b = b.reverse();
        System.out.println(a);
        System.out.println(b);
        a.append(b);
        System.out.println(a);
    }
}

//������ �6
//public class task_12 {
//    public static void main(String[] args) {
//
//    }
//}