package com.test.sql.six;

public final class Matrix extends ArrayPI {
    int[][] mas3 = new int[2][2];

    public int[][] Substraction() {
        this.mas3 = mas3;
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
        return mas3;
    }
}
