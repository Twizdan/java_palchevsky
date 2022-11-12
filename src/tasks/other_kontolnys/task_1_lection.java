//package praktikum1;
//
//import javax.swing.plaf.nimbus.State;
//import java.sql.*;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class task_1_lection {
//    public static void main(String[] args) throws SQLException {
//        Scanner scan = new Scanner(System.in);
//        int x = 0;
//        String s = "";
//        System.out.println("Введите название таблицы");
//        String tablename = scan.nextLine();
//        System.out.println("Введите три переменные");
//        Scanner new_first = new Scanner(System.in);
//        float first = new_first.nextFloat();
//        Scanner new_second = new Scanner(System.in);
//        float second = new_second.nextFloat();
//        Scanner new_third = new Scanner(System.in);
//        float third = new_third.nextFloat();
//
//        while (!"10".equals(s)) {
//            System.out.println("1. Выводим все таблицы из текущей базы данных.");
//            System.out.println("2. Создать таблицу в базе данных.");
//            System.out.println("3. Сложить числа и сохранить результат в таблицу");
//            System.out.println("4. Вычесть числа и сохранить результат в таблицу");
//            System.out.println("5. Умножить числа и сохранить результат в таблицу");
//            System.out.println("6. Делить числа и сохранить результат в таблицу");
//            System.out.println("7. Найти остаток от числа и сохранить результат в таблицу");
//            System.out.println("8. Возвести числа в модуль и сохранить результат в таблицу");
//            System.out.println("9. Возвести число в степень и сохранить результат  в таблицу.");
//            System.out.println("10. Выход из программы.");
//            s = scan.next();
//
//            try {
//                x = Integer.parseInt(s);
//            } catch (NumberFormatException e) {
//                System.out.println("Неверный формат ввода.");
//            }
//            switch (x) {
//                case 1 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl = "jdbc:mysql://localhost/test1";
//                    Connection con = DriverManager.getConnection(mysqlUrl, "root", "Karim16!");
//                    System.out.println("Успешно законнектились к базе данных!");
//                    Statement stmt = con.createStatement();
//                    ResultSet rs = stmt.executeQuery("show tables");
//                    System.out.println("Таблицы из текущей базы данных: ");
//                    while (rs.next()) {
//                        System.out.print(rs.getString(1));
//                        System.out.println();
//                    }
//                }
//                case 2 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl1 = "jdbc:mysql://localhost/test1";
//                    Connection con1 = DriverManager.getConnection(mysqlUrl1, "root", "Karim16!");
//                    System.out.println("Успешно законнектились к базе данных!");
//                    Statement stmt1 = con1.createStatement();
//                    String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (RESULT int)";
//                    stmt1.executeUpdate(query);
//                    ResultSet rs1 = stmt1.executeQuery("Show tables");
//                    System.out.println("Таблицы из текущей базы данных: ");
//                    while (rs1.next()) {
//                        System.out.print(rs1.getString(1));
//                        System.out.println();
//                    }
//                }
//                case 3 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl2 = "jdbc:mysql://localhost/test1";
//                    Connection con2 = DriverManager.getConnection(mysqlUrl2, "root", "Karim16!");
//                    System.out.println("Успешно законнектились к базе данных!");
//                    Statement stmt2 = con2.createStatement();
//                    System.out.println("Введите ID #1");
//                    int ID = scan.nextInt();
//                    System.out.println("Введите ID #2");
//                    int ID1 = scan.nextInt();
//                    scan.nextLine();
//                    System.out.println("Введите строку #1");
//                    String test = scan.nextLine();
//                    System.out.println("Введите строку #2");
//                    String test1 = scan.nextLine();
//                    String query2 = "INSERT INTO " + tablename + "(ID, test) VALUES (?, ?), (?, ?)";
//                    PreparedStatement stmt3 = con2.prepareStatement(query2);
//                    stmt3.setInt(1, ID);
//                    stmt3.setString(2, test);
//                    stmt3.setInt(3, ID1);
//                    stmt3.setString(4, test1);
//                    stmt3.executeUpdate();
//                    System.out.println("Данные в MySQL успешно внесены!");
//                    ResultSet rs2 = stmt3.executeQuery("SELECT * from " + tablename + "");
//                    System.out.println("Введеные данные: ");
//                    while (rs2.next()) {
//                        System.out.print(Arrays.toString(rs2.getString(1).split(" ")));
//                        System.out.print(Arrays.toString(rs2.getString(2).split(" ")));
//                        System.out.println();
//                    }
//                }
//                case 4 -> {
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                    String mysqlUrl2 = "jdbc:mysql://localhost/test1";
//                    Connection con2 = DriverManager.getConnection(mysqlUrl2, "root", "Karim16!");
//                    System.out.println("Успешно законнектились к базе данных!");
//                    float minus = (float) (first-second-third);
//                    String query3 = "INSERT INTO " + tablename;
//
//                }
//            }
//
//        }
//        System.out.println("Вышли из нашей программы");
//    }
//}
//
