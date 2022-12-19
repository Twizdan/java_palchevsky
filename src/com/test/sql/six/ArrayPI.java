package com.test.sql.six;

import java.util.Scanner;

public class ArrayPI {

    Scanner sc = new Scanner(System.in);

    public int[][] getMas1() {
        return mas1;
    }

    public void setMas1() {
        this.mas1 = mas1;
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                mas1[i][j] = sc.nextInt();
            }
        }
    }

    public int[][] getMas2() {
        return mas2;
    }

    public void setMas2() {
        this.mas2 = mas2;
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                mas2[i][j] = sc.nextInt();
            }
        }
    }

    int[][] mas1 = new int[2][2];
    int[][] mas2 = new int[2][2];
}
