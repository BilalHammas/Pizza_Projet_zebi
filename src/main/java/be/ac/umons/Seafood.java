package be.ac.umons;


public class Seafood extends Ingredient {
    public static int stock = 5;
    public Seafood() {
        this.setPrice(App.getPriceFromIngredient("Sea food"));
    }
}
