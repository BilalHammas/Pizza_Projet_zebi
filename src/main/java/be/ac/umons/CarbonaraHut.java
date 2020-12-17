package be.ac.umons;

public class CarbonaraHut extends Carbonara {

    @Override
    public float getPrice(){
         Olive O=new Olive();
        Carbonara C=new Carbonara();
        return (price=C.getPrice()+O.getPrice());
    }


    CarbonaraHut(){
        super();
        setName("CarbonaraHut");
        addIngredient(new Olive());
    }













}
