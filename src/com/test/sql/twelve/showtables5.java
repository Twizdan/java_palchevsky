package com.test.sql.twelve;

import java.sql.*;

public class showtables5 extends InformSystem2 {
    public showtables5() {
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
