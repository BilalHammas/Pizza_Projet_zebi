package be.ac.umons;

public abstract class DecoratorPizza implements PizzaComponent {
  protected String Dec;
  protected String name;

 protected float price2;
 protected Pizza p;

 public float getPriceDecoration(Pizza p){
 float sum=0;
 sum= p.getPrice()+ price2;
 return sum;
}
public float getPrice(){
  return price2;
}
public DecoratorPizza( Pizza p, String Dec){
this.p =p;
this.Dec=Dec;
}

public String decoration(){
 return Dec;
};

}
