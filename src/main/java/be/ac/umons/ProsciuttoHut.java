
package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class ProsciuttoHut extends Prosciutto {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Ham H=new Ham();
        Cheese C= new Cheese();
        Olive O= new Olive();
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
        Stocage.add(c);
        stock3= Collections.min(Stocage);

    }
    ProsciuttoHut(){
        super();
        setName("ProsciuttoHut");
        addIngredient(new Olive());
    }
    public  int getStock3(){
        return stock3;
    }
}
