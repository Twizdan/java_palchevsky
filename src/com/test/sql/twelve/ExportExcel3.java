package com.test.sql.twelve;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExportExcel3 extends InformSystem2 {
    public ExportExcel3() {
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
