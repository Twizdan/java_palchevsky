package com.test.sql.ten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InformSystem1 {
    protected static Scanner scan;
    protected static String tablename;
    protected static String mysqlUrl;
    protected static Connection con;

    public InformSystem1() {}

    public static void main(String[] args) throws SQLException {
        int x = 0;
        String s = "";

        while(!"7".equals(s)) {
            System.out.println("""
            1. ������� ��� ������� �� MySQL.
            2. ������� ������� � MySQL.
            3. ������ ������ � ���� ��������� � ��������� �� � MySQL.
            4. ������� ������ � �������� �� ID �� MySQL.
            5. ������� ������ � �������� �� MySQL �� ID.
            6. ��������� �������� ���������� �� MySQL � Excel.
            7. ����� �� ���������.
            """);
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException var4) {
                System.out.println("�������� ������ �����!");
            }

            switch (x) {
                case 1:
                    showtables4.main();
                    break;
                case 2:
                    createtable4.main();
                    break;
                case 3:
                    Result1.main();
                    break;
                case 4:
                    SelectID.main();
                    break;
                case 5:
                    DeleteID.main();
                    break;
                case 6:
                    ExportExcel2.main();
            }
        }

    }

    static {
        scan = new Scanner(System.in);
        tablename = scan.nextLine();
        mysqlUrl = "jdbc:mysql://localhost/java_pal";

        try {
            con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        } catch (SQLException var1) {
            throw new RuntimeException(var1);
        }
    }
}