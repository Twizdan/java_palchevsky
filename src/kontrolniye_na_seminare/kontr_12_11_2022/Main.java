package kontrolniye_na_seminare.kontr_12_11_2022;
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
        Fact num = new Fact();
        int number = sc1.nextInt();
        System.out.println("������ ���������");
        System.out.println(num.setEven_fact(number));
        System.out.println("�������� ���������");
        System.out.println(num.setOdd_fact(number));
    }
}
