package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WhiteSauce extends Ingredient {
    public WhiteSauce() {
        this.setPrice(App.getPriceFromIngredient("White cream"));
    }

}
