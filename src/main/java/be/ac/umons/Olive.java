package be.ac.umons;


public class Olive extends Ingredient{
    //protected static int stock = 5;
    public Olive() {
        this.setPrice(App.getPriceFromIngredient("Olive"));
    }
}
