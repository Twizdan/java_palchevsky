package com.test.sql;

import java.sql.*;
import java.util.Scanner;

public class third_task {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = " ";

        System.out.println("������� �������� �������: ");
        String tablename = sc.nextLine();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("���� ������ ����������");

        while (!"5".equals(s)) {
            System.out.println("""
                    1. ������� ��� ������� �� MySQL
                    2. ������� ������� � MySQL
                    3. ���������� ������ �������� �������� � ���������� � MySQL
                    4. ��������� ������ �� MySQL � Excel
                    5. ����� �� ���������
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
                    String query2 = "CREATE TABLE IF NOT EXISTS " + tablename + " (RAZ int, EVEN int)";
                    stmt2.executeUpdate(query2);
                    System.out.println("��������� �������, ���� � �� ����");
                }
                case 3 -> {
                    System.out.println("������� ���������� ����� ��� �����");
                    int n = sc.nextInt();
                    System.out.println("������� �����");
                    double[] numbs = new double[n];
                    int i = 0;
                    int[] evn = new int[n];
                    while (i<n) {
                        double number = sc.nextDouble();
                        if (number % 1 == 0) {
                            numbs[i] = number;
                            if (number % 2 == 0) {
                                evn[i] = 1;
                            } else {
                                evn[i] = 0;
                            }
                            i++;
                        } else {
                            System.out.println("��������� ����� �� �����, ����� �� ���������");
                        }
                    }
                    String query3 = "INSERT INTO " + tablename + " (RAZ, EVEN) VALUES (?, ?)";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    for (int j = 0; j<n; j++) {
                        stmt3.setDouble(1, numbs[j]);
                        stmt3.setInt(2, evn[j]);
                        stmt3.executeUpdate();
                    }
                    System.out.println("������ ������� ������� � MySQL");
                    ResultSet rs3 = stmt3.executeQuery("SELECT * from " + tablename + " ");
                    System.out.println("������ � �������: ");
                    while (rs3.next()) {
                        String vivod = rs3.getString(1);
                        System.out.print(vivod+" ");
                        vivod = rs3.getString(2);
                        System.out.print(vivod);
                        System.out.println();
                    }
                }
                case 4 -> {
                    sc.nextLine();
                    System.out.println("������� �������� �����: ");
                    String file = sc.nextLine();
                    String query10 = "SELECT 'RAZ','EVEN' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE '" + file + ".xls'";
                    PreparedStatement stmt10 = con.prepareStatement(query10);
                    stmt10.executeQuery();
                }
            }
        }
    }
}
