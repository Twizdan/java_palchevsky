package com.test.sql.ten;

import java.sql.*;
public class showtables4 extends InformSystem1 {
    public showtables4() {
    }

    public static void main() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "1234");
        System.out.println("Успешное подключение к базе данных!");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Show tables");
        System.out.println("Таблицы из текущей базы данных: ");

        while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println();
        }

    }
}
