package com.test.sql.nine;

public final class Substraction extends ArrayPI{
    int[][] mas3 = new int[2][2];

    Substraction(int[][] mas1, int[][] mas2) {
        super(mas1, mas2);
    }

    public void Substraction() {
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++){
                mas3[i][j] = mas1[i][j] - mas2[i][j];
            }
        }
    }

}
