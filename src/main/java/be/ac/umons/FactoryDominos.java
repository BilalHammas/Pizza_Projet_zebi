package be.ac.umons;
import java.util.Scanner;
import java.util.ArrayList;


public class FactoryDominos extends AbstractFactory {

    private static FactoryDominos Dominos=null;
    public static  FactoryDominos getFactory() {
        if (Dominos==null) {
            return new FactoryDominos();
        }
        return Dominos;
    }

    private FactoryDominos(){}

    @Override
    public Pizza createPizza(String name) {
        if (name.equals("Proscuitto") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockHam>0)){
            stockDough--;
            stockTomatosauce--;
            stockCheese--;
            stockHam--;
            return new Prosciutto();
        }
        else if (name.equals("FruttiDiMare") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockSeafood>0 )){
            stockDough--;
            stockTomatosauce--;
            stockCheese--;
            stockSeafood--;
            return new FruttiDiMare();
        }
        else if (name.equals("Carbonara") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockHam>0 )){
            stockDough--;
            stockWhitesauce--;
            stockCheese--;
            stockHam--;
            return new Carbonara();
        }
        else if (name.equals("Margherita") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0)){
            stockDough--;
            stockTomatosauce--;
            stockCheese--;
            return new Margherita();
        }
        else{
            Distributeur.stockChannel.lowStockAlert("");
            return null;
        }
    }
}
