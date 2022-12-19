package com.test.sql.twelve;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Result2 extends InformSystem2 {
    public Result2() {
    }

    public static void main() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl2 = "jdbc:mysql://localhost/java_pal";
        Connection con2 = DriverManager.getConnection(mysqlUrl2, "root", "1234");
        System.out.println("Успешное подключение к базе данных!");
        System.out.println("Введите количество студентов, которых вы хотите ввести:");
        int F = scan.nextInt();
        ArrayList<String> ARR = new ArrayList(Arrays.asList());
        System.out.println(ARR);

        String Student_FIO;
        String Student_Group;
        String query3;
        PreparedStatement stmt4;
        for(int i1 = 0; i1 < F; ++i1) {
            System.out.println("Введите ID(в котором будут хранится вся информация о студенте): ");
            int ID1 = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите направление подготовки студента: ");
            Student_FIO = scan.nextLine();
            System.out.println("Введите ФИО студента: ");
            Student_Group = scan.nextLine();
            System.out.println("Введите группу студента: ");
            Student_Group = scan.nextLine();
            ARR.add(Student_Group);
            System.out.println(ARR);
            query3 = "INSERT INTO " + tablename + " (ID, StudentDirection, StudentFIO, StudentGroup) VALUES (?, ?, ?, ?)";
            stmt4 = con2.prepareStatement(query3);
            stmt4.setInt(1, ID1);
            stmt4.setString(2, Student_FIO);
            stmt4.setString(3, Student_Group);
            stmt4.setString(4, Student_Group);
            stmt4.executeUpdate();
        }

        int ID1 = 0;
        String Student_Direction = "";
        Student_FIO = "";
        Student_Group = "";
        Student3 student2 = new Student4(ID1, Student_Direction, Student_FIO, Student_Group);
        student2.Sort(ARR);
        query3 = "ALTER TABLE " + tablename + " ADD ArrayStudents VARCHAR(1000) NOT NULL DEFAULT ''";
        stmt4 = con2.prepareStatement(query3);
        stmt4.executeUpdate();
        String query4 = "INSERT INTO " + tablename + " VALUES(0,'-','-','-',?)";
        PreparedStatement stmt5 = con2.prepareStatement(query4);
        stmt5.setString(1, String.valueOf(ARR));
        stmt5.executeUpdate();
        System.out.println("Результат успешно сохранён в MySQL!");
        ResultSet rs2 = stmt4.executeQuery("SELECT * FROM " + tablename + " ORDER BY StudentFIO");
        System.out.println("Результат: ");

        while(rs2.next()) {
            System.out.print(rs2.getString(1));
            System.out.print(Arrays.toString(rs2.getString(2).split(" ")));
            System.out.print(Arrays.toString(rs2.getString(3).split(" ")));
            System.out.print(Arrays.toString(rs2.getString(4).split(" ")));
            System.out.print(rs2.getString(5));
            System.out.println();
        }

    }
}