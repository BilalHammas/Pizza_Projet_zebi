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
               if (name=="Prosciutto" && stockP>0){
                stockP--;
                ProsciuttoHut tmp=new ProsciuttoHut();
            return tmp;
             }
        else if (name=="FruttiDiMare" && stockF>0){
            stockF--;
            FruttiDiMare tmp=new FruttiDiMareHut();

            return tmp;
        }
        else if (name=="Carbonara" && stockC>0){
            stockC--;
            Carbonara tmp=new CarbonaraHut();

            return tmp;
        }
        else if (name=="Margherita" && stockM>0){
            stockM--;
            Margherita tmp=new MargheritaHut();

            return tmp;
        }
        else{
            return null;
        }
    }
}

//faire comme ProscuittoHut