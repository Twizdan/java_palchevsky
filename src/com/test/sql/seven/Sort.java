package com.test.sql.seven;

import java.util.Collections;

public final class Sort extends ArrayPI{

    Sort(int[] mas) {
        super(mas);
    }
    public void Sortir() {
        this.mas = mas;
        for (int i = 0; i<10; i++) {
            for (int j = i+1; j<10; j++) {
                if (mas[i] > mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
    }

    public void SortirReversed() {
        this.mas = mas;
        for (int i = 0; i<10; i++) {
            for (int j = i+1; j<10; j++) {
                if (mas[i] < mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
    }
}
