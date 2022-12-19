package com.test.sql;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class first_task {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = " ";
        System.out.println("������� ��� ����� ����������");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("������� �������� �������: ");
        String tablename = sc.nextLine();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("���� ������ ����������");

        while (!"11".equals(s)) {
            System.out.println("1. ������� ��� ������� �� MySQL");
            System.out.println("2. ������� ������� � MySQL");
            System.out.println("3. �������� ����� � ��������� ��������� � �������");
            System.out.println("4. ��������� ����� � ��������� ��������� � �������");
            System.out.println("5. ��������� ����� � ��������� ��������� � �������");
            System.out.println("6. ������� ����� � ��������� ��������� � �������");
            System.out.println("7. ��������� ������� �� ������� ����� � ��������� ��������� � �������");
            System.out.println("8. ��������� � ����� ������ � ��������� ��������� � �������");
            System.out.println("9. ���������� ����� � ������� � ��������� ��������� � �������");
            System.out.println("10. ��������� ��� ������ �� MySQL � Excel");
            System.out.println("11. ����� �� ���������");
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
                    String query2 = "CREATE TABLE IF NOT EXISTS " + tablename + " (RES float)";
                    stmt2.executeUpdate(query2);
                    System.out.println("��������� �������, ���� � �� ����");
                }
                case 3 -> {
                    double summary = a + b;
                    String query3 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    stmt3.setDouble(1, summary);
                    stmt3.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs3.next()) {
                        System.out.print(Arrays.toString(rs3.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 4 -> {
                    double substraction = a - b;
                    String query4 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt4 = con.prepareStatement(query4);
                    stmt4.setDouble(1, substraction);
                    stmt4.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs4 = stmt4.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs4.next()) {
                        System.out.print(Arrays.toString(rs4.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 5 -> {
                    double multiplication = a * b;
                    String query5 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt5 = con.prepareStatement(query5);
                    stmt5.setDouble(1, multiplication);
                    stmt5.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs5 = stmt5.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs5.next()) {
                        System.out.print(Arrays.toString(rs5.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 6 -> {
                    double division = a / b;
                    String query6 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt6 = con.prepareStatement(query6);
                    stmt6.setDouble(1, division);
                    stmt6.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs6 = stmt6.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs6.next()) {
                        System.out.print(Arrays.toString(rs6.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 7 -> {
                    double ost = a % b;
                    String query7 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt7 = con.prepareStatement(query7);
                    stmt7.setDouble(1, ost);
                    stmt7.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs7 = stmt7.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs7.next()) {
                        System.out.print(Arrays.toString(rs7.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 8 -> {
                    double ost = Math.abs(a);
                    String query8 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt8 = con.prepareStatement(query8);
                    stmt8.setDouble(1, ost);
                    stmt8.executeUpdate();
                    ost = Math.abs(b);
                    stmt8.setDouble(1, ost);
                    stmt8.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs8 = stmt8.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs8.next()) {
                        System.out.print(Arrays.toString(rs8.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 9 -> {
                    double level = Math.pow(a, b);
                    String query9 = "INSERT INTO " + tablename + " (RES) VALUES (?)";
                    PreparedStatement stmt9 = con.prepareStatement(query9);
                    stmt9.setDouble(1, level);
                    stmt9.executeUpdate();
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs9 = stmt9.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs9.next()) {
                        System.out.print(Arrays.toString(rs9.getString((1)).split(" ")));
                        System.out.println();
                    }
                }
                case 10 -> {
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
