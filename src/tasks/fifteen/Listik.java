package tasks.fifteen;

import java.util.Scanner;

public class Listik {
    Listik() {
        this.mas = printik();
    }
    int[] mas;

    public static int[] printik() {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[50];
        for (int i = 0; i<50; i++) {
            mas[i] = sc.nextInt();
        }
        return mas;
    }
}
