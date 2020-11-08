package be.ac.umons;

public class Carbonara extends Pizza
{
    Carbonara()
    {
        super("Carbonara");
        addIngredient(new Dough());
        addIngredient(new WhiteSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}