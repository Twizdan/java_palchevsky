package tasks.kontrolnaya_12_11_2022.first_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Straight object = new Straight();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("������� ������ �������");
        object.setFirst_side(sc1.nextFloat());

        System.out.println("������� ������ ����������");
        object.setSecond_side(sc1.nextFloat());

        System.out.println("������� ������ ����������");
        object.setThird_side(sc1.nextFloat());
        float hypotenuse = Math.max(Math.max(object.getFirst_side(), object.getSecond_side()), object.getThird_side());
        float summary = object.getThird_side() + object.getSecond_side() + object.getFirst_side();
        float catet_1 = Math.min(Math.min(object.getFirst_side(), object.getSecond_side()), object.getThird_side());
        float catet_2 = summary - hypotenuse - catet_1;

        if (hypotenuse < (catet_1 + catet_2)){
            System.out.println("�������");
            object.setSquare(object.getFirst_side(), object.getSecond_side(), object.getThird_side());
            System.out.println(object.getSquare());

            System.out.println("��������");
            object.setPerimeter(object.getFirst_side(), object.getSecond_side(), object.getThird_side());
            System.out.println(object.getPerimeter());

            System.out.println("�������� �� ����������� �������������?");
            object.setFlag(object.isFlag());
            String str_flag = new String();
            if (object.isFlag() == true) {
                str_flag = "��������";
            } else {
                str_flag = "�� ��������";
            }
            System.out.println(str_flag);
        } else {
            System.out.println("������ ������������ ������������ �� �����");
        }
    }
}
