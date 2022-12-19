package com.test.sql.six;

import java.sql.*;
import java.util.Scanner;

public class six_task {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Matrix mam = new Matrix();

        int x = 0;
        String s = " ";


        System.out.println("Введите название таблицы: ");
        String tablename = sc.nextLine();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("База данных подключена");

        while (!"6".equals(s)) {
            System.out.println("""
                    1. Вывести все таблицы из MySQL
                    2. Создать таблицу в MySQL
                    3. Ввести две матрицы с клавиатуры и результат в MySQL
                    4. Перемножить две матрицы и результат в MySQL
                    5. Сохранить результат из MySQL в Excel
                    6. Выход из программы
                    """);
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
                    String query2 = "CREATE TABLE IF NOT EXISTS " + tablename + " (RES varchar(255))";
                    stmt2.executeUpdate(query2);
                    System.out.println("Добавлена таблица, если её не было");
                }
                case 3 -> {
                    System.out.println("Введите 8 переменных для двух матриц");
                    mam.setMas1();
                    mam.setMas2();
                    int[][] mas1 = mam.getMas1();
                    int[][] mas2 = mam.getMas2();
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    String aboba = "";
                    for (int i = 0; i<2; i++){
                        for (int j = 0; j<2; j++) {
                            aboba += mas1[i][j] + " ";
                        }
                        stmt3.setString(1, aboba);
                        stmt3.executeUpdate();
                        aboba = "";
                    }
                    for (int i = 0; i<2; i++){
                        for (int j = 0; j<2; j++) {
                            aboba += mas2[i][j] + " ";
                        }
                        stmt3.setString(1, aboba);
                        stmt3.executeUpdate();
                        aboba = "";
                    }
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
                    int[][] mas3 = mam.Substraction();
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    String aboba = "";
                    for (int i = 0; i<2; i++){
                        for (int j = 0; j<2; j++) {
                            aboba += mas3[i][j] + " ";
                        }
                        stmt3.setString(1, aboba);
                        stmt3.executeUpdate();
                        aboba = "";
                    }
                    System.out.println("Данные успешно внесены в MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT (RES) from " + tablename + " ");
                    System.out.println("Данные в таблице: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 5 -> {
                    sc.nextLine();
                    System.out.println("Введите название файла: ");
                    String file = sc.nextLine();
                    String query10 = "SELECT 'RES' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE '" + file + ".xls'";
                    PreparedStatement stmt10 = con.prepareStatement(query10);
                    stmt10.executeQuery();
                }
            }
        }
    }
}
