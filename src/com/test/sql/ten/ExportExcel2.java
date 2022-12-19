package com.test.sql.ten;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExportExcel2 extends InformSystem1 {
    public ExportExcel2() {
    }

    public static void main() throws SQLException {
        scan.nextLine();
        System.out.println("Введите название файла: ");
        String file = scan.nextLine();
        String query1 = "SELECT 'ID','StudentDirection','StudentFIO','StudentGroup' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE '" + file + ".xls'";
        PreparedStatement stmt1 = con.prepareStatement(query1);
        stmt1.executeQuery();
        System.out.println("Данные успешно экспортированы!");
    }
}
