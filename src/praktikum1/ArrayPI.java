package praktikum1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPI {
    protected static Scanner sc = new Scanner(System.in);

    private int[][] array_1 = new int[7][7];

    public int[][] getArray_2() {
        return array_2;
    }

    public void setArray_2(int[][] array_2) {
        this.array_2 = array_2;
    }

    static int[][] array_2 = new int[7][7];

    public int[][] getArray_1() {
        return array_1;
    }

    public void setArray_1(int[][] array_1) {
        this.array_1 = array_1;

    }
}
//    public static void main(String[] args) {
//        int i;
//        int j;
//        for (i = 0; i < .length; i++) {
//            for (j = 0; j < array_1[i].length; j++) {
//                System.out.println("¬ведите элемент первого массива [" + i + "] [" + j + "]");
//                array_1[i][j] = sc.nextInt();
//                System.out.println("¬ведите элемент второго массива [" + i + "] [" + j + "]");
//                array_2[i][j] = sc.nextInt();
//            }
//        }
//    }
//}