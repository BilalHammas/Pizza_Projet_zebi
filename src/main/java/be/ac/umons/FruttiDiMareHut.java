package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class FruttiDiMareHut extends FruttiDiMare {
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
    public float getPrice(){
        return price ;
    }

    FruttiDiMareHut(){
        super();
        setName("FruttiDiMareHut");
        Olive O =new Olive();
        price+=price+O.getPrice("Olive");
        addIngredient(O);
        addIngredient(O);
    }
    @Override
    public  int getStock3(){
        return stock3;
    }
}
