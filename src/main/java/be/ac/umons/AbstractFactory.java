package be.ac.umons;

import be.ac.umons.database.DBSingleton;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractFactory
{
    String name;
    static int stockOlive=5;
    static int stockDough=5;
    static int stockWhitesauce=5;
    static int stockCheese=5;
    static int stockHam=5;
    static int stockTomatosauce=5;
    static int stockSeafood=5;

    public  AbstractFactory getFactory(String name){
        if (name.equals("FactoryHut")){
            return FactoryHut.getFactory();
        }
        else if (name.equals("FactoryDominos")){
            return FactoryDominos.getFactory();
        }
        else{
            return null;
        }
    }


    public Pizza createPizza(String name){
        return new Pizza(name);
    }

    public void recharge(){
        stockOlive=5;
        stockDough=5;
        stockWhitesauce=5;
        stockCheese=5;
        stockHam=5;
        stockTomatosauce=5;
        stockSeafood=5;
    }

    public static float getPriceFromIngredient(String ingredientName) {
        try {
            ResultSet rs;
            String url = "jdbc:mysql://localhost/user01_pizzeria?serverTimezone=UTC";
            String username = "root";
            String password = "";

            DBSingleton db = DBSingleton.getSingleton(url, username, password);
            rs = db.querySelect("SELECT * FROM ingredients");
            String compare;
            while (rs.next()) {
                compare = rs.getString("name");
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
