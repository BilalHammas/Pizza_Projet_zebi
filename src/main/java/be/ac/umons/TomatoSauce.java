package be.ac.umons;


public class TomatoSauce extends Ingredient {
    public TomatoSauce() {
        this.setPrice(App.getPriceFromIngredient("Tomato sauce"));
    }
}
