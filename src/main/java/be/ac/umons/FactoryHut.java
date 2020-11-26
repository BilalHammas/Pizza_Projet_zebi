package be.ac.umons;

public class FactoryHut extends AbstractFactory {

    private static FactoryHut Hut=null;
    public static  FactoryHut getFactory() {
        if (Hut==null) {
            return new FactoryHut();
        }
        return Hut;
    }

    static int stockP=2;
    static int stockM=2;
    static int stockF=2;
    static int stockC=2;
    @Override
    public Pizza createPizza(String name) {
        if (name.equals("Prosciutto") && stockP>0){
            stockP--;
            return new ProsciuttoHut();
        }
        else if (name.equals("FruttiDiMare") && stockF>0){
            stockF--;
            return new FruttiDiMareHut();
        }
        else if (name.equals("Carbonara") && stockC>0){
            stockC--;
            return new CarbonaraHut();
        }
        else if (name.equals("Margherita") && stockM>0){
            stockM--;
            return new MargheritaHut();
        }
        else{
            return null;
        }
    }
}

//faire comme ProscuittoHut