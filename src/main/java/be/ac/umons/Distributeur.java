package be.ac.umons;

import java.util.Scanner;
import java.util.ArrayList;

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
            return new FactoryDominos();
        }
        else {
            return new FactoryHut();
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

    public void FaireCommande(ArrayList<PizzaComponent>tespizza){
        int size= tespizza.size();
        int numero = 0;
        System.out.println("first call");
        System.out.println("Combien de pizza voulez vous?");
        while(size>0 && numero < size){
            System.out.println(size);
            Thread t = new Thread(new TestThread(tespizza,numero));

            t.start();
            numero += 1;
            size=size-1;
        }
    }
}
