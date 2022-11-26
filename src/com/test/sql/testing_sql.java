package com.test.sql;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class testing_sql {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = "";
        System.out.println("Введите название таблицы: ");
        String tablename = sc.nextLine();

        while (!"4".equals(s)) {
            System.out.println("1. Выводим все таблицы из текущей базы данных");
            System.out.println("2. Создать таблицу в базе данных");
            System.out.println("3. Добавить данные в таблицу");
            System.out.println("4. Выход из программы");
            s = sc.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            }
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String mysqlUrl = "jdbc:mysql://localhost/java_pal";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
            System.out.println("База данных подключена");
            switch (x) {
                case 1 -> {
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SHOW TABLES");
                    System.out.println("Таблицы:");
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                        System.out.println();
                    }
                }
                case 2 -> {
                    Statement stmt1 = con.createStatement();
                    String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (ID int, test varchar(255))";
                    stmt1.executeUpdate(query);
                    System.out.println("Добавлена таблица, если её не было");
                }
                case 3 -> {
                    System.out.println("Введите ID");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Введите строку");
                    String test = sc.nextLine();
                    String query3 = "INSERT INTO " + tablename + " (ID, test) VALUES (?, ?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setInt(1, ID);
                    stmt3.setString(2, test);
                    stmt3.executeUpdate();
                    System.out.println("Данные в MySQL успешно внесены");
                    ResultSet rs2 = stmt3.executeQuery("SELECT * from " + tablename + "");
                    System.out.println("Введенные данные: ");
                    while (rs2.next()) {
                        System.out.print(Arrays.toString(rs2.getString((1)).split(" ")));
                        System.out.print(Arrays.toString(rs2.getString((2)).split(" ")));
                        System.out.println();
                    }
                }
             }
        }
    }
}
