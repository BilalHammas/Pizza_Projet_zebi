package be.ac.umons;

import javafx.scene.text.Text;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Distributeur {
    public static lowStockChannel stockChannel = new lowStockChannel();
    public static Viewers user = new Viewers("Utilisateur");

    public Distributeur() {
        stockChannel.register(user);
        user.setSubject(stockChannel);
        //user.update(); /* Permets d'update l'user même si c'est fait automatiquement. */
    }

    public AbstractFactory WichFactory() {
        int numero;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("Quel type de distributeur");
            System.out.println("(0)Dominos,(1)Hut");
            numero = cin.nextInt();

        } while(numero != 0 && numero != 1);

        if (numero == 0) {
            return FactoryDominos.getFactory();
        }
        else {
            return FactoryHut.getFactory();
        }

    }


    public ArrayList<PizzaComponent> Commande(AbstractFactory f) {
        int j;
        int numero;
        int deco;
        ArrayList<String> Choix = new ArrayList<>();
        ArrayList<PizzaComponent> tespizza= new ArrayList<>();
        Choix.add("Prosciutto");
        Choix.add("FruttiDiMare");
        Choix.add("Margherita");
        Choix.add("Carbonara");

        Scanner cin = new Scanner(System.in);
        System.out.println("Combien de pizza voulez-vous ?");
        int number = cin.nextInt();
        for (j = 0; j < number; j++) {
            do {
                System.out.println("Entrez le numero associé à la pizza ente 0 et 3");
                System.out.println("(0)Proscuitto,(1)FruttiDiMare,(2)Margheritha,(3)Carbonara");
                numero = cin.nextInt();

            } while (numero != 0 && numero != 1 && numero != 2 && numero != 3);

            String name1 = Choix.get(numero);
            Pizza p = f.createPizza(name1);
            do {
                System.out.println("Voici les décorations supplémentaires :(0)Rien,(1)Cheesy,(2)Pan");
                deco = cin.nextInt();
            } while (deco != 0 && deco != 1 && deco != 2);

            if (deco == 1) {
                Cheesy p2 = new Cheesy(p);
                tespizza.add(p2);
            } else if (deco == 2) {
                Pan p2 = new Pan(p);
                tespizza.add(p2);
            } else {
                tespizza.add(p);
            }
        }
        return tespizza;
    }

    public void FaireCommande(ArrayList<PizzaComponent>tespizza, Controller controller) throws InterruptedException {
        int size= tespizza.size();
        PizzaComponent poisonPill = new Pizza("poisonPill");
        BlockingQueue<PizzaComponent> queue = new LinkedBlockingDeque<>();
        System.out.println(tespizza);
        for (PizzaComponent pizzaComponent : tespizza) {
            queue.put(pizzaComponent);
        }
        queue.put(poisonPill);
        System.out.println("voici l'array totale des pizza : ");
        System.out.println(queue);
        //
        new Thread(new QueuedThread(queue, poisonPill, controller)).start();
        new Thread(new QueuedThread(queue, poisonPill, controller)).start();
        /*
        System.out.println("Combien de pizza voulez vous?");
        while(size>0 && numero < size){
            System.out.println(size);
            Thread t = new Thread(new QueuedThread(queue, poisonPill));

            t.start();
            numero += 1;
            size=size-1;
        }
        */
    }
}
