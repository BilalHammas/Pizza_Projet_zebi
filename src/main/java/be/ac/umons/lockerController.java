package be.ac.umons;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class lockerController implements Initializable {

    @FXML
    private AnchorPane lockerPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void loadDominos() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));

        Parent root = (Parent) loader.load();
        Controller mainController = loader.getController();


        mainController.setFactory("Dominos");



        AnchorPane mainPane = FXMLLoader.load(getClass().getResource("main.fxml"));
        lockerPane.getChildren().setAll(mainPane);
    }

    public void loadHutt() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));

        Parent root = (Parent) loader.load();
        Controller mainController = loader.getController();


        mainController.setFactory("Hutt");



        AnchorPane mainPane = FXMLLoader.load(getClass().getResource("main.fxml"));
        lockerPane.getChildren().setAll(mainPane);
    }
}
