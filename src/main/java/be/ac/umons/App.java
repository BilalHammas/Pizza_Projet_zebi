package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The main class of the project.
 *
 */
public class App
{
/*
    public static void main( String[] args ) throws InterruptedException {

    }

     */
    private static void updateQueryDemo() {
        try {
            //DBSingleton db = DBSingleton.getSingleton(url, username, password);
            DBSingleton db = DBSingleton.getSingleton();

            Object[] arguments = new Object[2];
            arguments[0] = formatDotDecimal(new BigDecimal(10.2));
            arguments[1] = "N/A";

            int result = db.queryUpdate("INSERT INTO ingredients(name, price) VALUES ('N/A', '0.0')");
            ColorPrint.printDebug("inserting N/A into ingredients, return value : " + result);

            result = db.queryUpdate("UPDATE ingredients SET price = %s WHERE name = '%s'", arguments);
            ColorPrint.printDebug("updating ingredients return value : " + result);

            ResultSet rs = db.querySelect("SELECT * FROM ingredients");

            while (rs.next()) {
                System.out.println(rs.getString("name") + " : " + rs.getBigDecimal("price"));
            }
            rs.close();

            result = db.queryUpdate("DELETE FROM ingredients WHERE name = '%s'", arguments[1]);
            ColorPrint.printDebug("delete dough from ingredients : " + result);

        } catch (SQLException e) {
            ColorPrint.printError("SQL Error : " + e.getMessage());
        } catch (NullPointerException e) {
            ColorPrint.printError(e.getMessage());
        }
    }

    /**
     * Get a money value as a string with a dot separator for decimals
     * @param money the value to format
     * @return a string representation of a money value
     */
    public static String formatDotDecimal(BigDecimal money) {
        DecimalFormatSymbols decimalSymbol = DecimalFormatSymbols.getInstance();
        decimalSymbol.setDecimalSeparator('.');
        return new DecimalFormat("0.00", decimalSymbol).format(money);
    }

    public static float getPriceFromIngredient(String ingredientName) {
        try {
            String url = "jdbc:mysql://localhost/user01_pizzeria?serverTimezone=UTC";
            String username = "root";
            String password = "";

            DBSingleton db = DBSingleton.getSingleton(url, username, password);
            ResultSet rs = db.querySelect("SELECT * FROM ingredients");
            while (rs.next()) {
                String compare = rs.getString("name");
                if(ingredientName.equals(compare)) {
                    return(rs.getBigDecimal("price").floatValue());
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return 0;
    }
}


