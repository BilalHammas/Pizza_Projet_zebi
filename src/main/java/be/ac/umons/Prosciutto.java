package be.ac.umons;


public class Prosciutto extends Pizza{
    @Override
    public float getPrice() {
        return price;
    }


    Prosciutto()
    {

        super("Prosciutto");

        Dough D=new Dough();
        TomatoSauce W= new TomatoSauce();
        Ham H=new Ham();
        Cheese C= new Cheese();
        price=App.getPriceFromIngredient("Dough") + App.getPriceFromIngredient("TomatoSauce") + App.getPriceFromIngredient("Cheese") + App.getPriceFromIngredient("Ham");
        addIngredient(D);
        addIngredient(W);
        addIngredient(H);
        addIngredient(C);
        //ceci est un commentaire
    }
}