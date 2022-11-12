package praktikum1;

import java.util.Scanner;

public class kontrolnaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите две строки, затем подстроку");
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.substring(3,6));
        System.out.println(b.substring(0,2));
        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());
        System.out.println(a.indexOf(c));
        System.out.println(b.indexOf(c));
        System.out.println(a.endsWith(c));
        System.out.println(b.endsWith(c));
    }
}