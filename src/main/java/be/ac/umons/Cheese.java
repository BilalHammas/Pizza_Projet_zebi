package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

public class Cheese extends Ingredient {

    public Cheese() {
        this.setPrice(App.getPriceFromIngredient("Cheese"));
    }
}
