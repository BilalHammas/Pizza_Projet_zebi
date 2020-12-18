package be.ac.umons;

import java.util.ArrayList;
import java.util.Collections;

public class FruttiDiMareHut extends FruttiDiMare {
    private static int stock3=1;
    private static void StockX(){
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Seafood H=new Seafood();
        Olive O=new Olive();
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
        Olive O=new Olive();
        FruttiDiMare C=new FruttiDiMareHut();
        return (price=C.getPrice()+O.getPrice());
    }

    FruttiDiMareHut(){
        super();
        setName("FruttiDiMareHut");
        addIngredient(new Olive());
    }
    public  int getStock3(){
        return stock3;
    }
}
