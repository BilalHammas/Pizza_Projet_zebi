
package be.ac.umons;


public class ProsciuttoHut extends Prosciutto {
    ProsciuttoHut(){
        super();
        Olive O= new Olive();
        setName("ProsciuttoHut");
        price+=price+App.getPriceFromIngredient("Olive");
        addIngredient(O);
    }
}
