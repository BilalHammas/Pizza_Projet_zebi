package be.ac.umons;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Dough extends Ingredient{
    public static int stock = 5;
    public Dough() {
        this.setPrice(App.getPriceFromIngredient("Dough"));
        if (stock >= 1) {
            stock--;
            int a=getStock();
            int b=0;
            stock=Math.max(a,0);
        }
        if (stock == 0) {
            Distributeur.stockChannel.lowStockAlert("Dough");
        }
    }

    @Override
    public void provide() {
        stock=5;
    }

    public int getStock(){
        return stock;
    }


    @Override
    public void AddStock(){
        stock+=1;

    }
}
