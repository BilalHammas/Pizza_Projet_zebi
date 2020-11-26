package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Cheese extends Ingredient {
    public static stock = 5;
    public Cheese() {
        this.setPrice(App.getPriceFromIngredient("Cheese"));
        if stock >= 1 {
            stock--;
        }
        if stock == 0 {
            Distributeur.stockChannel.lowStockAlert("Cheese")
        }
    }
}
