package kontrolniye_na_seminare.kontr_12_11_2022;

import tasks.kontrolnaya_12_11_2022.first_task.Straight;
import tasks.kontrolnaya_12_11_2022.second_task.Fact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tasks.kontrolnaya_12_11_2022.first_task.Straight object = new Straight();
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
            object.setFlag();
            String str_flag;
            if (object.isFlag()) {
                str_flag = "��������";
            } else {
                str_flag = "�� ��������";
            }
            System.out.println(str_flag);
        } else {
            System.out.println("������ ������������ ������������ �� �����");
        }

        System.out.println("������� ����� ��� ���������� ����������");
        tasks.kontrolnaya_12_11_2022.second_task.Fact num = new Fact();
        num.setNumber(sc1.nextInt());
        num.setEven_fact(num.getNumber());
        num.setOdd_fact(num.getNumber());
        System.out.println("������ ���������");
        System.out.println(num.getEven_fact());
        System.out.println("�������� ���������");
        System.out.println(num.getOdd_fact());
    }
}
