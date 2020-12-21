package be.ac.umons;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private AnchorPane mainPane;
    @FXML private ListView<String> returnMessage;
    @FXML private Text labelMessage;
    @FXML private ComboBox<String> pizzaBox;
    @FXML private ComboBox<String> decoratorBox;
    @FXML private Text errorMessage;
    @FXML private Text totalPrice;
    @FXML private Text factoryType;
    @FXML private Text stockOlive;
    @FXML private Text stockCheese;
    @FXML private Text stockHam;
    @FXML private Text stockTomato;
    @FXML private Text stockWhite;
    @FXML private Text stockDough;
    @FXML private Text stockSeafood;
    @FXML private ListView<String> pizzaList;

    private float price;
    private static String fType; //Dominos ou Hutt
    private static String returnTextMessage = "";
    private AbstractFactory factory;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorMessage.setText("");
        labelMessage.setText("Opérations");
        pizzaBox.getItems().addAll("Margherita", "Proscuitto", "Carbonara", "FruttiDiMare");
        decoratorBox.getItems().addAll("Rien", "Cheesy", "Pan");
        factoryType.setText(fType);
        setStocks();
        if(factoryType.getText().equals("Hutt")) {
            this.factory = FactoryHut.getFactory();
        } else {
            this.factory = FactoryDominos.getFactory();
        }
    }

    public void setReturnMessage(String message) {
        Platform.runLater(() -> returnMessage.getItems().add(message));
    }

    public void setStocks() {
        stockCheese.setText("Stock Cheese : " + AbstractFactory.stockCheese);
        stockOlive.setText("Stock Olive : " + AbstractFactory.stockOlive);
        stockHam.setText("Stock Ham : " + AbstractFactory.stockHam);
        stockDough.setText("Stock Dough : " + AbstractFactory.stockDough);
        stockWhite.setText("Stock White sauce : " + AbstractFactory.stockWhitesauce);
        stockTomato.setText("Stock Tomato sauce : " + AbstractFactory.stockTomatosauce);
        stockSeafood.setText("Stock White sauce : " + AbstractFactory.stockSeafood);
    }

    public void setFactory(String factory) {
        fType = factory;
    }

    public void addPizza(MouseEvent mouseEvent) {
        String deco;
        if(pizzaBox.getValue()!= null && decoratorBox.getValue()!=null) {
            if(decoratorBox.getValue().equals("Rien")){
                deco = "";
            } else {
                deco = decoratorBox.getValue();
            }

            pizzaList.getItems().add(deco + " " + pizzaBox.getValue() + " "  + " " + factoryType.getText() + " " + price + "€");
        }
    }

    public void updatePrice(ActionEvent actionEvent) {
        price = 0;
        if(factoryType.getText().equals("Hutt")) {
            price += AbstractFactory.getPriceFromIngredient("Olive");
        }
        if(pizzaBox.getValue() != null) {
            if(pizzaBox.getValue().equals("Margherita")){
                price += AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("Tomato Sauce") + AbstractFactory.getPriceFromIngredient("Cheese");
            }
            if(pizzaBox.getValue().equals("Proscuitto")){
                price += AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("Tomato Sauce") + AbstractFactory.getPriceFromIngredient("Cheese") + AbstractFactory.getPriceFromIngredient("Ham");
            }
            if(pizzaBox.getValue().equals("Carbonara")){
                price += AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("White Sauce") + AbstractFactory.getPriceFromIngredient("Cheese") + AbstractFactory.getPriceFromIngredient("Ham");
            }
            if(pizzaBox.getValue().equals("FruttiDiMare")){
                price += AbstractFactory.getPriceFromIngredient("Dough") + AbstractFactory.getPriceFromIngredient("Tomato Sauce") + AbstractFactory.getPriceFromIngredient("Sea Food") + AbstractFactory.getPriceFromIngredient("Cheese");
            }
        }
        if(decoratorBox.getValue() != null ){
            if(decoratorBox.getValue().equals("Cheesy")) {
                price += 2;
            }
            if(decoratorBox.getValue().equals("Pan")) {
                price += 1.5;
            }
        }
        totalPrice.setText("Prix : " + price + "€");
    }

    public void startPrep(MouseEvent mouseEvent) throws InterruptedException {
        ArrayList<PizzaComponent> tespizza= new ArrayList<>();
        Distributeur pizzaDistributeur = new Distributeur();
        // loop for each pizza
        ArrayList<String> listElements = new ArrayList<>(pizzaList.getItems());
        for (String c : listElements) {
            String[] elements = c.split(" ");
            String pizzaName = elements[1];
            String decoName = elements[0];
            Pizza currentPizza = factory.createPizza(pizzaName);
            if(currentPizza != null) {
                switch (decoName) {
                    case "Pan" -> {
                        Pan panPizza = new Pan(currentPizza);
                        tespizza.add(panPizza);
                    }
                    case "Cheesy" -> {
                        Cheesy cheesyPizza = new Cheesy(currentPizza);
                        tespizza.add(cheesyPizza);
                    }
                    case "" -> tespizza.add(currentPizza);
                }
                pizzaList.getItems().remove(0);
                setStocks();
            } else {
                errorMessage.setText("Veuillez refournir les ingrédients");
                setReturnMessage("Les pizzas restantes ne peuvent pas être créées, veuillez remplir les ingrédients.");
            }
        }
        pizzaDistributeur.FaireCommande(tespizza, this);
        /*
        Distributeur pizzaDistributeur = new Distributeur();
        for(int i = 0; i< pizzaList.getAdapter().getCount(); i++) {
            pizzaList.getItems().get(i);
        }*/
    }

    public void rechargeIngred(MouseEvent mouseEvent) {
        factory.recharge();
        setStocks();
    }
}
