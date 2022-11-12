package tasks.other_kontolnys;

import java.util.Scanner;

//public class task_1 {
//    public static void main (String[] praktikum1) {
//        Scanner first_in = new Scanner(System.in);
//        System.out.print("Введите первую переменную: ");
//        byte first = first_in.nextByte();
//
//        Scanner second_in = new Scanner(System.in);
//        System.out.print("Введите вторую переменную: ");
//        int second = second_in.nextInt();
//
//
//        Scanner third_in = new Scanner(System.in);
//        System.out.print("Введите третью переменную: ");
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

// Задача #2
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


// Задача #3
//public class task_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        if (a % 1 == 0) {
//            if (a % 2 == 0) System.out.println("Первое число четное");
//            else System.out.println("Первое число нечетное");
//        }
//        else {
//            System.out.println("Введенное число не целое");
//        }
//        if (b % 1 == 0) {
//            if (b % 2 == 0) System.out.println("Второе число четное");
//            else System.out.println("Второе число нечетное");
//        }
//        else {
//            System.out.println("Введенное число не целое");
//        }
//        if (c % 1 == 0) {
//            if (c % 2 == 0) System.out.println("Третье число четное");
//            else System.out.println("Третье число нечетное");
//        }
//        else {
//            System.out.println("Введенное число не целое");
//        }
//    }
//}


// Задача #4
//public class task_1 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Введите сначала две строки, затем подстроку");
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

//Задача #5
public class task_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите две строки");
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

//Задача №6
//public class task_12 {
//    public static void main(String[] args) {
//
//    }
//}