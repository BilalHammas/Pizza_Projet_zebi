package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Olive extends Ingredient{
    protected static int stock = 5;
    public Olive() {
        this.setPrice(App.getPriceFromIngredient("Olive"));
         if (stock >= 1) {
            stock--;
             int a=getStock();
             int b=0;
             stock=Math.max(a,0);
        }
         if (stock == 0) {
            Distributeur.stockChannel.lowStockAlert("Olive");
        }
    }

    @Override
    public void provide() {
        stock=5;
    }
    @Override
    public int getStock(){
        return stock;
    }
}
