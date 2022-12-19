package com.test.sql.ten;

import java.sql.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Result1 extends InformSystem1 {
    public Result1() {
    }

    public static void main() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl2 = "jdbc:mysql://localhost/java_pal";
        Connection con2 = DriverManager.getConnection(mysqlUrl2, "root", "1234");
        System.out.println("Успешное подключение к базе данных!");
        System.out.println("Введите количество студентов, которых вы хотите ввести:");
        int F = scan.nextInt();

        for(int i1 = 0; i1 < F; ++i1) {
            System.out.println("Введите ID(в котором будут хранится вся информация о студенте): ");
            int ID1 = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите направление подготовки студента: ");
            String Student_Direction = scan.nextLine();
            System.out.println("Введите ФИО студента: ");
            String Student_FIO = scan.nextLine();
            System.out.println("Введите группу студента: ");
            String Student_Group = scan.nextLine();
            String query2 = "INSERT INTO " + tablename + " (ID, StudentDirection, StudentFIO, StudentGroup) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt3 = con2.prepareStatement(query2);
            stmt3.setInt(1, ID1);
            stmt3.setString(2, Student_Direction);
            stmt3.setString(3, Student_FIO);
            stmt3.setString(4, Student_Group);
            stmt3.executeUpdate();
            System.out.println("Результат успешно сохранён в MySQL!");
            ResultSet rs2 = stmt3.executeQuery("SELECT * FROM " + tablename);
            System.out.println("Результат: ");

            while(rs2.next()) {
                System.out.print(Arrays.toString(rs2.getString(1).split(" ")));
                System.out.print(Arrays.toString(rs2.getString(2).split(" ")));
                System.out.print(Arrays.toString(rs2.getString(3).split(" ")));
                System.out.print(Arrays.toString(rs2.getString(4).split(" ")));
                System.out.println();
            }

            System.out.println("Полиморфный вызов:");
            Student student = new Student(ID1, Student_Direction, Student_FIO, Student_Group);
            Student student1 = new Student1(ID1, Student_Direction, Student_FIO, Student_Group);
            Student student2 = new Student2(ID1, Student_Direction, Student_FIO, Student_Group);
            List<Student> PI = Arrays.asList(student, student1, student2);
            Iterator var15 = PI.iterator();

            while(var15.hasNext()) {
                Student i = (Student)var15.next();
                i.Test();
            }
        }

    }
}
