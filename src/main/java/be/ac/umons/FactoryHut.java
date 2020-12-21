package be.ac.umons;

public class FactoryHut extends AbstractFactory {

    private static FactoryHut Hut=null;
    public static  FactoryHut getFactory() {
        if (Hut==null) {
            return new FactoryHut();
        }
        return Hut;
    }

    private FactoryHut(){}

    @Override
    public Pizza createPizza(String name) {
        if (name.equals("Proscuitto") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockHam>0 && stockOlive>0)){
            stockDough--;
            stockTomatosauce--;
            stockCheese--;
            stockHam--;
            stockOlive--;
            return new ProsciuttoHut();
        }
        else if (name.equals("FruttiDiMare") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockSeafood>0 && stockOlive>0)){
            stockDough--;
            stockTomatosauce--;
            stockCheese--;
            stockSeafood--;
            stockOlive--;
            return new FruttiDiMareHut();
        }
        else if (name.equals("Carbonara") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockHam>0 && stockOlive>0)){
            stockDough--;
            stockWhitesauce--;
            stockCheese--;
            stockHam--;
            stockOlive--;
            return new CarbonaraHut();
        }
        else if (name.equals("Margherita") && (stockDough>0 && stockTomatosauce>0 && stockCheese>0 && stockOlive>0)){
            stockDough--;
            stockTomatosauce--;
            stockCheese--;
            stockOlive--;
            return new MargheritaHut();
        }
        else{
            Distributeur.stockChannel.lowStockAlert("");
            return null;
        }
    }
}

//faire comme ProscuittoHut