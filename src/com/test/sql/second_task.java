package com.test.sql;

import java.sql.*;
import java.util.Scanner;

public class second_task {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = " ";
        System.out.println("Введите две любые строки");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Введите название таблицы: ");
        String tablename = sc.nextLine();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("База данных подключена");

        while (!"8".equals(s)) {
            System.out.println("1. Вывести все таблицы из MySQL");
            System.out.println("2. Создать таблицу в MySQL");
            System.out.println("3. Ввести две строки с клавиатуры и сохранить в MySQL");
            System.out.println("4. Подсчитать размер строк и результат сохранить в MySQL");
            System.out.println("5. Объединить две строки и результат сохранить в MySQL");
            System.out.println("6. Сравнить две строки и результат сохранить в MySQL");
            System.out.println("7. Сохранить все данные из MySQL в Excel");
            System.out.println("8. Выход из программы");
            s = sc.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            }

            switch (x) {
                case 1 -> {
                    Statement stmt1 = con.createStatement();
                    ResultSet rs = stmt1.executeQuery("SHOW TABLES");
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                    }
                }
                case 2 -> {
                    Statement stmt2 = con.createStatement();
                    String query2 = "CREATE TABLE IF NOT EXISTS " + tablename + " (RES varchar(255), RAZ int)";
                    stmt2.executeUpdate(query2);
                    System.out.println("Добавлена таблица, если её не было");
                }
                case 3 -> {
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setString(1, a);
                    stmt3.executeUpdate();
                    stmt3.setString(1, b);
                    stmt3.executeUpdate();
                    System.out.println("Данные успешно внесены в MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT (RES) from " + tablename + " ");
                    System.out.println("Данные в таблице: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 4 -> {
                    String query3 = "UPDATE " + tablename + " SET RAZ = (?) WHERE RES = (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setInt(1, a.length());
                    stmt3.setString(2, a);
                    stmt3.executeUpdate();
                    stmt3.setInt(1, b.length());
                    stmt3.setString(2, b);
                    stmt3.executeUpdate();
                    System.out.println("Данные успешно внесены в MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT RAZ from " + tablename + " ");
                    System.out.println("Данные в таблице: ");
                    while (rs3.next()) {
                        int raz3 = rs3.getInt(1);
                        if (raz3 != 0) {
                            System.out.print(raz3);
                            System.out.println();
                        }
                    }
                }
                case 5 -> {
                    String ab = a+b;
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setString(1, ab);
                    stmt3.executeUpdate();
                    System.out.println("Данные успешно внесены в MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT (RES) from " + tablename + " ");
                    System.out.println("Данные в таблице: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 6 -> {
                    String diff = (a.equals(b) ? "Yes" : "No");
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setString(1, diff);
                    stmt3.executeUpdate();
                    System.out.println("Данные успешно внесены в MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT (RES) from " + tablename + " ");
                    System.out.println("Данные в таблице: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 7 -> {
                    sc.nextLine();
                    System.out.println("Введите название файла: ");
                    String file = sc.nextLine();
                    String query10 = "SELECT 'RES', 'RAZ' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE '" + file + ".xls'";
                    PreparedStatement stmt10 = con.prepareStatement(query10);
                    stmt10.executeQuery();
                }
            }
        }
    }
}
