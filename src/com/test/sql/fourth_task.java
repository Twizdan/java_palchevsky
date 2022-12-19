package com.test.sql;

import java.sql.*;
import java.util.Scanner;

public class fourth_task {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = " ";
        System.out.println("������� ��� ������: ��� ������ � ������ ��� ��������");
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        System.out.println("������� �������� �������: ");
        String tablename = sc.nextLine();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("���� ������ ����������");

        while (!"7".equals(s)) {
            System.out.println("""
                    1. ������� ��� ������� �� MySQL
                    2. ������� ������� � MySQL
                    3. ����������� ��������� �� ��������, ��������� � MySQL
                    4. ������� ����� � ������� � ������ ��������, ��������� ��������� � MySQL
                    5. ����� ��������� � ����������� ��������� ���������, ��������� ��������� � MySQL
                    6. ��������� ��� ������ �� MySQL � Excel
                    7. ����� �� ���������
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
                    System.out.println("������� ������� ��� ���������, �� 0 �� " + (Math.min(a.length(), b.length())));
                    int ind1 = sc.nextInt();
                    int ind2 = sc.nextInt();
                    String a1 = a.substring(ind1, ind2);
                    String b1 = b.substring(ind1, ind2);
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setString(1, a1);
                    stmt3.executeUpdate();
                    stmt3.setString(1, b1);
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
                case 4 -> {
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setString(1, a.toLowerCase());
                    stmt3.executeUpdate();
                    stmt3.setString(1, b.toLowerCase());
                    stmt3.executeUpdate();
                    stmt3.setString(1, a.toUpperCase());
                    stmt3.executeUpdate();
                    stmt3.setString(1, b.toUpperCase());
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
                    int astr = a.lastIndexOf(c);
                    int bstr = a.lastIndexOf(c);
                    boolean diff = a.endsWith(c);
                    boolean diff1 = b.endsWith(c);
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setInt(1, astr);
                    stmt3.executeUpdate();
                    stmt3.setInt(1, bstr);
                    stmt3.executeUpdate();
                    stmt3.setBoolean(1, diff);
                    stmt3.executeUpdate();
                    stmt3.setBoolean(1, diff1);
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
                case 6 -> {
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