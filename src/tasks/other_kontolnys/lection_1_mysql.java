//package tasks.other_kontolnys;
//
//import javax.swing.plaf.nimbus.State;
//import java.sql.*;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class lection_1_mysql {
//    public static void main(String[] args) throws SQLException {
//        Scanner scan = new Scanner(System.in);
//        int x = 0;
//        String s = "";
//        System.out.println("������� �������� �������");
//        String tablename = scan.nextLine();
//
//        while (!"4".equals(s)) {
//            System.out.println("1. ������� ��� ������� �� ������� ���� ������.");
//            System.out.println("2. ������� ������� � ���� ������ ��� ������������ � ������������.");
//            System.out.println("3. �������� ������ � �������.");
//            System.out.println("4. ����� �� ���������.");
//            s = scan.next();
//
//            try {
//                x = Integer.parseInt(s);
//            } catch (NumberFormatException e) {
//                System.out.println("�������� ������ �����.");
//            }
//            switch (x) {
//                case 1 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl = "jdbc:mysql://localhost/test1";
//                    Connection con = DriverManager.getConnection(mysqlUrl, "root", "Karim16!");
//                    System.out.println("������� �������������� � ���� ������!");
//                    Statement stmt = con.createStatement();
//                    ResultSet rs = stmt.executeQuery("show tables");
//                    System.out.println("������� �� ������� ���� ������: ");
//                    while (rs.next()) {
//                        System.out.print(rs.getString(1));
//                        System.out.println();
//                    }
//                }
//                case 2 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl1 = "jdbc:mysql://localhost/test1";
//                    Connection con1 = DriverManager.getConnection(mysqlUrl1, "root", "Karim16!");
//                    System.out.println("������� �������������� � ���� ������!");
//                    Statement stmt1 = con1.createStatement();
//                    String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (ID int, test varchar(255))";
//                    stmt1.executeUpdate(query);
//                    ResultSet rs1 = stmt1.executeQuery("Show tables");
//                    System.out.println("������� �� ������� ���� ������: ");
//                    while (rs1.next()) {
//                        System.out.print(rs1.getString(1));
//                        System.out.println();
//                    }
//                }
//                case 3 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl2 = "jdbc:mysql://localhost/test1";
//                    Connection con2 = DriverManager.getConnection(mysqlUrl2, "root", "Karim16!");
//                    System.out.println("������� �������������� � ���� ������!");
//                    Statement stmt2 = con2.createStatement();
//                    System.out.println("������� ID #1");
//                    int ID = scan.nextInt();
//                    System.out.println("������� ID #2");
//                    int ID1 = scan.nextInt();
//                    scan.nextLine();
//                    System.out.println("������� ������ #1");
//                    String test = scan.nextLine();
//                    System.out.println("������� ������ #2");
//                    String test1 = scan.nextLine();
//                    String query2 = "INSERT INTO " + tablename + "(ID, test) VALUES (?, ?), (?, ?)";
//                    PreparedStatement stmt3 = con2.prepareStatement(query2);
//                    stmt3.setInt(1, ID);
//                    stmt3.setString(2, test);
//                    stmt3.setInt(3, ID1);
//                    stmt3.setString(4, test1);
//                    stmt3.executeUpdate();
//                    System.out.println("������ � MySQL ������� �������!");
//                    ResultSet rs2 = stmt3.executeQuery("SELECT * from " + tablename + "");
//                    System.out.println("�������� ������: ");
//                    while (rs2.next()) {
//                        System.out.print(Arrays.toString(rs2.getString(1).split(" ")));
//                        System.out.print(Arrays.toString(rs2.getString(2).split(" ")));
//                        System.out.println();
//                    }
//                }
//            }
//
//        }
//        System.out.println("����� �� ����� ���������");
//    }
//}
//
