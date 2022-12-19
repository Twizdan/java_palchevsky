package com.test.sql.seven;

import java.sql.*;
import java.util.Scanner;

public class seven_task {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� 10 ��������� �������");
        int[] mas = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = sc.nextInt();
        }

        int x = 0;
        String s = " ";

        sc.nextLine();
        System.out.println("������� �������� �������: ");
        String tablename = sc.nextLine();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("���� ������ ����������");

        while (!"6".equals(s)) {
            System.out.println("""
                    1. ������� ��� ������� �� MySQL
                    2. ������� ������� � MySQL
                    3. ������ ���������� ������ � ��������� � MySQL
                    4. ������������� ������ ��������� � ��������� � MySQL
                    5. ��������� ��������� �� MySQL � Excel
                    6. ����� �� ���������
                    """);
            s = sc.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("�������� ������ �����");
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
                    System.out.println("��������� �������, ���� � �� ����");
                }
                case 3 -> {
                    Sort mam = new Sort(mas);
                    String query = "INSERT INTO " + tablename + "(RES) VALUES (?)";
                    PreparedStatement stmt = con.prepareStatement(query);
                    String abobik = "";
                    for (int i = 0; i<mas.length; i++) {
                        abobik += mas[i]+" ";
                    }
                    stmt.setString(1, abobik);
                    stmt.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs3 = stmt.executeQuery("SELECT (RES) from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 4 -> {
                    Sort mam = new Sort(mas);
                    mam.Sortir();
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    String aboba = "";
                    for (int i = 0; i<10; i++) {
                        aboba += mam.mas[i] + " ";
                    }
                    stmt3.setString(1, aboba);
                    stmt3.executeUpdate();
                    mam.SortirReversed();
                    aboba = "";
                    for (int i = 0; i<10; i++) {
                        aboba += mam.mas[i] + " ";
                    }
                    stmt3.setString(1, aboba);
                    stmt3.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT (RES) from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 5 -> {
                    sc.nextLine();
                    System.out.println("������� �������� �����: ");
                    String file = sc.nextLine();
                    String query10 = "SELECT 'RES' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE '" + file + ".xls'";
                    PreparedStatement stmt10 = con.prepareStatement(query10);
                    stmt10.executeQuery();
                }
            }
        }
    }
}
