package com.test.sql.twelve;

import java.sql.*;
import java.util.Arrays;

public class SelectID2 extends InformSystem2 {
    public SelectID2() {
    }

    public static void main() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl1 = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl1, "root", "1234");
        System.out.println("Успешное подключение к базе данных!");
        System.out.println("Введите ID студента о котором вы хотите вывсети всю информацию:");
        int ID1 = scan.nextInt();
        String query1 = "SELECT * FROM " + tablename + " WHERE ID = '" + ID1 + "'";
        PreparedStatement stmt1 = con.prepareStatement(query1);
        ResultSet rs2 = stmt1.executeQuery();
        System.out.println("Результат: ");

        while(rs2.next()) {
            System.out.print(Arrays.toString(rs2.getString(1).split(" ")));
            System.out.print(Arrays.toString(rs2.getString(2).split(" ")));
            System.out.print(Arrays.toString(rs2.getString(3).split(" ")));
            System.out.print(Arrays.toString(rs2.getString(4).split(" ")));
            System.out.println();
        }

    }
}