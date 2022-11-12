package tasks.other_kontolnys;

import com.sun.source.tree.StatementTree;

import java.sql.*;

public class main {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jbdc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "Karim16!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases");
            System.out.println("Connected");
            System.out.println(rs);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
