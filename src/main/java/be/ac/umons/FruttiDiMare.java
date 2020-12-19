package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class FruttiDiMare extends Pizza {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        D.AddStock();
        TomatoSauce W= new TomatoSauce();
        W.AddStock();
        Seafood H=new Seafood();
        H.AddStock();
        Olive O=new Olive();
        O.AddStock();
        int i=H.getStock();
        int j=W.getStock();
        int w=D.getStock();
        int o=O.getStock();
        ArrayList<Integer> Stocage=new ArrayList<Integer>();
        Stocage.add(i);
        Stocage.add(j);
        Stocage.add(w);
        ////Stocage.add(o);
        stock3= Collections.min(Stocage);
    }

    @Override
    public float getPrice() {
        return price;
    }
    public FruttiDiMare(){
        super("FruttiDiMare");
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Seafood H=new Seafood();
        price+=D.getPrice("Dough")+W.getPrice("Tomatosauce")+H.getPrice("Seafood");
        addIngredient(new Seafood());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        addIngredient(new Cheese());
    }
    @Override
    public int getStock3(){
        return stock3;
    }
}

