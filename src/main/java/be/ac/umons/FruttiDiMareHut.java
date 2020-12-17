package be.ac.umons;

public class FruttiDiMareHut extends FruttiDiMare {

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

}
