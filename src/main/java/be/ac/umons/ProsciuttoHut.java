
package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class ProsciuttoHut extends Prosciutto {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        D.AddStock();
        TomatoSauce W= new TomatoSauce();
        W.AddStock();
        Ham H=new Ham();
        H.AddStock();
        Cheese C= new Cheese();
        C.AddStock();
        Olive O= new Olive();
        O.AddStock();
        int i=H.getStock();
        int h=H.getStock();
        int w=D.getStock();
        int c=D.getStock();
        int o=O.getStock();
        ArrayList<Integer> Stocage=new ArrayList<Integer>();
        Stocage.add(i);
        Stocage.add(h);
        Stocage.add(w);
        Stocage.add(c);
        Stocage.add(o);
        stock3= Collections.min(Stocage);

    }
    ProsciuttoHut(){
        super();
        Olive O= new Olive();
        setName("ProsciuttoHut");
        price+=price+O.getPrice("Olive");
        addIngredient(O);
    }
    @Override
    public  int getStock3(){
        return stock3;
    }
}
