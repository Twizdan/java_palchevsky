package com.test.sql.ten;

import java.sql.*;

public class DeleteID extends InformSystem1 {
    public DeleteID() {
    }

    public static void main() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String mysqlUrl1 = "jdbc:mysql://localhost/java_pal";
        Connection con = DriverManager.getConnection(mysqlUrl1, "root", "1234");
        System.out.println("Успешное подключение к базе данных!");
        System.out.println("Введите ID удаляемого студента:");
        int ID1 = scan.nextInt();
        String query1 = "SET SQL_SAFE_UPDATES = 0";
        String query2 = "DELETE FROM " + tablename + " WHERE ID = '" + ID1 + "'";
        String query3 = "SET SQL_SAFE_UPDATES = 1";
        PreparedStatement stmt1 = con.prepareStatement(query1);
        PreparedStatement stmt2 = con.prepareStatement(query2);
        PreparedStatement stmt3 = con.prepareStatement(query3);
        stmt1.executeUpdate();
        stmt2.executeUpdate();
        stmt3.executeUpdate();
        System.out.println("Студент с ID = " + ID1 + " успешно удалён из базы данных!");
    }
}