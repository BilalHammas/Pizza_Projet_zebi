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

    static int stockP=2;
    static int stockM=2;
    static int stockF=2;
    static int stockC=2;
    @Override
    public Pizza createPizza(String name) {
        if (name.equals("Prosciutto") && stockP>0){
            stockP--;
            return new Prosciutto();
        }
        else if (name.equals("FruttiDiMare") && stockF>0){
            stockF--;
            return new FruttiDiMare();
        }
        else if (name.equals("Carbonara") && stockC>0){
            stockC--;
            return new Carbonara();
        }
        else if (name.equals("Margherita") && stockM>0){
            stockM--;
            return new Margherita();
        }
        else{
            return null;
        }
    }
}
