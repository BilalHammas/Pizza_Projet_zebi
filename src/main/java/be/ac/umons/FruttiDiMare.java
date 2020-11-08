package be.ac.umons;

public class FruttiDiMare extends Pizza {

    public FruttiDiMare(){
        super("FrittiDiMare");
        addIngredient(new Seafood());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        addIngredient(new Cheese());
    }
}

