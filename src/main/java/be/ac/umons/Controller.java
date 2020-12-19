package be.ac.umons;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private AnchorPane mainPane;
    @FXML private Text returnMessage;
    @FXML private ComboBox factoryBox;
    @FXML private ComboBox pizzaBox;
    @FXML private ComboBox decoratorBox;
    @FXML private Text errorMessage;
    @FXML private Text totalPrice;
    @FXML private Text factoryType;
    @FXML private ListView pizzaList;

    private float price;
    private static String fType;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorMessage.setText("");
        returnMessage.setText("");
        pizzaBox.getItems().addAll("Margherita", "Proscuitto", "Carbonara", "Frutti di mare");
        decoratorBox.getItems().addAll("Rien", "Cheesy", "Pan");
        factoryType.setText(this.fType);
    }

    public void setFactory(String factory) {
        this.fType = factory;
        System.out.println(this.fType);
    }

    public Controller getController() {
        return this;
    }

    public void addPizza(MouseEvent mouseEvent) {
        String deco;
        if(pizzaBox.getValue()!= null && decoratorBox.getValue()!=null) {
            if(decoratorBox.getValue()=="Rien"){
                deco = "";
            } else {
                deco = decoratorBox.getValue().toString();
            }

            pizzaList.getItems().add(deco + " " + pizzaBox.getValue() + " "  + " " + factoryType.getText() + " " + price + "€");
        }
    }

    public void updatePrice(ActionEvent actionEvent) {
        price = 0;
        if(factoryType.getText().equals("Hutt")) {
            price += 1;
        }
        if(pizzaBox.getValue() == "Margherita"){
            price += 6.5;
        }
        if(pizzaBox.getValue() == "Proscuitto"){
            price += 8.5;
        }
        if(pizzaBox.getValue() == "Carbonara"){
            price += 9;
        }
        if(pizzaBox.getValue() == "Frutti di mare"){
            price += 6.5;
        }
        if(decoratorBox.getValue() == "Cheesy") {
            price += 2;
        }
        if(decoratorBox.getValue() == "Pan") {
            price += 1.5;
        }
        totalPrice.setText("Prix : " + price + "€");
    }

    public void startPrep(MouseEvent mouseEvent) {
        System.out.println(pizzaList.getItems());
    }
}
