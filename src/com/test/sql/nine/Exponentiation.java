package com.test.sql.nine;

public final class Exponentiation extends ArrayPI{

    Exponentiation(int[][] mas1, int[][] mas2) {
        super(mas1, mas2);
    }

    public void Exponentiation1() {
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                mas1[i][j] = mas1[i][j] * mas1[i][j];
            }
        }
    }
    public void Exponentiation2() {
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                mas2[i][j] = mas2[i][j] * mas2[i][j];
            }
        }
    }
}
