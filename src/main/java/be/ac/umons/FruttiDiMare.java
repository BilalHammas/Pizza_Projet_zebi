package be.ac.umons;

public class FruttiDiMare extends Pizza {

    @Override
    public float getPrice() {
        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Cheese C= new Cheese();
        Seafood H=new Seafood();
        return (price=D.getPrice()+W.getPrice()+ C.getPrice()+H.getPrice());
    }
    public FruttiDiMare(){
        super("FrittiDiMare");
        addIngredient(new Seafood());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        addIngredient(new Cheese());
    }
}

