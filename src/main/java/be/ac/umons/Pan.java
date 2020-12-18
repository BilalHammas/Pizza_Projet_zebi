package be.ac.umons;

public class Pan extends DecoratorPizza{
    public  Pan(Pizza p){
          super(p,"Pan",3/2);

    }
    @Override
    public String decoration (){
        return "Pan";
    }

    @Override
    public String getName(){
        return Dec;
    }
    @Override
    public float getPrice(){
        return price2;// aller dansq la basqe de donnée pour recuprer le prix
    }
    @Override
    public void setPrice(float p)
    {
        price2=3;
    }
    @Override
    public void setName(String Dec)
    {

        this.Dec=Dec;
    }
}
