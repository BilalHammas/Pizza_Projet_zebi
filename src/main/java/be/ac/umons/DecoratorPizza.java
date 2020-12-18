package be.ac.umons;

public abstract class DecoratorPizza implements PizzaComponent {
  protected String Dec;
  protected String name;

 protected float price2;
 protected Pizza p;

 public float getPrice(Pizza p){
 float sum=0;
 sum= p.getPrice()+ price2;
 return sum;
}

public DecoratorPizza( Pizza p, String Dec, float price2){
this.p =p;
this.Dec=Dec;
this.name = p.getName();
this.price2= p.getPrice()+price2;
}

public String decoration(){
 return Dec;
};

}
