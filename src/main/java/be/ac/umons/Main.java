package be.ac.umons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Parent locker = FXMLLoader.load(getClass().getResource("test.fxml"));
        primaryStage.setTitle("OMEGALUL PIZZA MAKER 3004");
        Scene scene = new Scene(locker);
        primaryStage.setScene(scene);
        scene.getWindow().sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
