package be.ac.umons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueuedThread implements Runnable {
    private BlockingQueue<PizzaComponent> pizzaQueue;
    private final PizzaComponent poisonPill;
    private final Controller controller;

    public QueuedThread(BlockingQueue<PizzaComponent> queue, PizzaComponent poisonPill, Controller controller) {
        this.pizzaQueue = queue;
        this.poisonPill = poisonPill;
        this.controller = controller;
    }

    @Override
    public void run() {
        try {
            while(true) {
                PizzaComponent currentPizza = pizzaQueue.take();
                if (currentPizza == poisonPill) {
                    return;
                }
                /*
                FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));

                Parent root = (Parent) loader.load();
                Controller mainController = loader.getController();
                 */
                System.out.println("we're here");
                controller.setReturnMessage("Traitement de la Pizza: " + currentPizza.getName());
                TimeUnit.SECONDS.sleep(10);
                controller.setReturnMessage("Pizza " + currentPizza.getName() + " préparée!");
            }
            //processPizza();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
