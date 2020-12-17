package be.ac.umons;

public class MargheritaHut extends Margherita {
    @Override
    public float getPrice(){
        Olive O=new Olive();
        Margherita C=new Margherita();
        return (price=C.getPrice()+O.getPrice());
    }

    public MargheritaHut(){
        super();
        setName("MarheritaHut");
        addIngredient(new Olive());
    }

}
