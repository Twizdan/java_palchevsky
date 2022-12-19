package com.test.sql.nine;

public final class Multiplication extends ArrayPI {

    Multiplication(int[][] mas1, int[][] mas2) {
        super(mas1, mas2);
    }
    int[][] mas3 = new int[2][2];
    public void Multiplication() {
        for(int i=0;i<2;i++)
        {
            for(int u=0;u<2;u++)
            {
                for(int j=0;j<2;j++)
                {
                    mas3[i][u]+=mas1[i][j]*mas2[j][u];
                }
            }
        }
    }
}
