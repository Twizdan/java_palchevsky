package com.test.sql.nine;


import java.lang.reflect.Array;

public class ArrayPI {

    ArrayPI(int[][] mas1, int[][] mas2) {
        this.mas1 = mas1;
        this.mas2 = mas2;
    }

    public int[][] getMas1() {
        return mas1;
    }


    public int[][] getMas2() {
        return mas2;
    }

    int[][] mas1;
    int[][] mas2;
}
