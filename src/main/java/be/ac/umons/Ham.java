package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Ham extends Ingredient {
    public static stock = 5;
    public Ham() {
        this.setPrice(App.getPriceFromIngredient("Ham"));
        if stock >= 1 {
            stock--;
        }
        if stock == 0 {
            Distributeur.stockChannel.lowStockAlert("Ham")
        }
    }
}
