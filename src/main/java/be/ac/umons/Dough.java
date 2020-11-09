package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Dough extends Ingredient{
    public Dough() {
        try {

            //DBSingleton db = DBSingleton.getSingleton("jdbc://localhost:3306/mysql", "username", "password");
            DBSingleton db = DBSingleton.getSingleton();

            ResultSet rs = db.querySelect("SELECT * FROM ingredients");

            while (rs.next()) {
                if ("Dough".equals(rs.getString("name"))) {
                    this.setPrice(rs.getBigDecimal("price").floatValue());
                }
            }
            rs.close();
            //updateQueryDemo();

        } catch (SQLException e) {
            ColorPrint.printError("SQL ERROR : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.print(AnsiColor.RED);
            e.printStackTrace();
            System.out.print(AnsiColor.RESET);
        }
    }
}
