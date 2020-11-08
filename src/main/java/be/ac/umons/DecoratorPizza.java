package be.ac.umons;

public abstract class DecoratorPizza implements PizzaComponent {
String Dec;

 protected String name;
 protected float price;
 protected Pizza p;

public DecoratorPizza(Pizza p, String Dec){
this.p =p;
this.Dec=Dec;
}

public String decoration(){
 return Dec;
};



}
