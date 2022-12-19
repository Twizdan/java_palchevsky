package com.test.sql.ten;

import java.sql.*;


public class createtable4 extends InformSystem1 {
    public createtable4() {
    }

    public static void main() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl1 = "jdbc:mysql://localhost/java_pal";
        Connection con1 = DriverManager.getConnection(mysqlUrl1, "root", "1234");
        System.out.println("Успешное подключение к базе данных!");
        Statement stmt1 = con1.createStatement();
        String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (ID int, StudentDirection varchar(255), StudentFIO varchar(255), StudentGroup varchar(255))";
        stmt1.executeUpdate(query);
        ResultSet rs1 = stmt1.executeQuery("Show tables");
        System.out.println("Таблицы из текущей базы данных: ");

        while(rs1.next()) {
            System.out.print(rs1.getString(1));
            System.out.println();
        }

    }
}
