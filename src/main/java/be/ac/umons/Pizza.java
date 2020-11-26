package be.ac.umons;
import java.util.ArrayList;

public class Pizza implements PizzaComponent {
    protected String name;
    protected float price=0;
    protected ArrayList<Ingredient>listingredients = new ArrayList<>();
    Pizza(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice(){
        return price;
    }

    @Override
    public void setName(String n)
    {

        this.name=n;
    }

    @Override
    public void setPrice(float p)
    {

        this.price=p;
    }

    public ArrayList<Ingredient> getListingredients(){

        return listingredients;
    }

    public void addIngredient(Ingredient i)
    {
        listingredients.add(i);
    }

   // @Override
    /*public String toString ()
    {
        return (this.name+" "+this.price.toString());


    }
*/


}

