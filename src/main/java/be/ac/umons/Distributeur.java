package be.ac.umons;

import java.util.Scanner;
import java.util.ArrayList;

public class Distributeur {
    public static lowStockChannel stockChannel = new lowStockChannel();
    public static Viewers user = new Viewers("Utilisateur");

    public Distributeur() {
        stockChannel.register(user);
        user.setSubject(stockChannel);
        user.update(); /* Permets d'update l'user même si c'est fait automatiquement. */
    }

    public AbstractFactory WichFactory() {
        int numero = 0;
        ArrayList<String> Facto = new ArrayList<String>();
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("Quel type de distributeur");
            System.out.println("(0)Dominos,(1)Hut");
            numero = cin.nextInt();

        } while (numero != 0 || numero != 1);

        if (numero == 0) {
            AbstractFactory p2 = new FactoryDominos();
            return p2;
        }
        else {
            AbstractFactory p1 = new FactoryHut();
            return p1;
        }

    }


    public ArrayList<PizzaComponent> Commande(AbstractFactory f) {
        int totalprice=0;
        int i=0;
        int j = 0;
        int numero = 0;
        int deco;
        ArrayList<String> Choix = new ArrayList<String>();
        ArrayList<String> TesPizza = new ArrayList<String>();
        ArrayList<PizzaComponent> tespizza= new ArrayList<PizzaComponent>();
        Choix.add("Proscuitto");
        Choix.add("FruttiDiMare");
        Choix.add("Margheritha");
        Choix.add("Carbonara");

        Scanner cin = new Scanner(System.in);
        System.out.println("Combien de pizza voulez");
        int number = cin.nextInt();
        for (j = 0; j < number; j++) {
            do {
                System.out.println("Entrez le numero associé à la pizza ente 0 et 3");
                System.out.println("(0)Proscuitto,(1)FruttiDiMare,(2)Margheritha,(3)Carbonara");
                numero = cin.nextInt();

            } while (numero != 0 || numero != 1 || numero != 2 || numero != 3);

            String name1 = Choix.get(numero);
            Pizza p = f.createPizza(name1);
            do {
                System.out.println("Voici les décorations supplémentaires :(0)Rien,(1)Cheesy,(2)Pan");
                deco = cin.nextInt();
            } while (deco != 0 || deco != 1 || deco != 2);
            if (deco == 1) {
                Cheesy p2 = new Cheesy(p);
                tespizza.add(p2);
                break;


            } else if (deco == 2) {
                Pan p2 = new Pan(p);
                tespizza.add(p2);
                break;

            } else {
                tespizza.add(p);
                break;

            }

        }
        for (i=0;i<number;i++){

            totalprice+=(tespizza.get(i)).getPrice();


        }
        System.out.println("Le prix de votre pizza est "+totalprice);
        return tespizza;

    }

    public void FaireCommande(ArrayList<PizzaComponent>tespizza){
        int j=0;
        int numero=0;
        int size= tespizza.size();
        int size1= size;
        Scanner cin= new Scanner(System.in);
        System.out.println("Combien de pizza voulez vous?");
        int number=cin.nextInt();
        while(numero<=size1-1){
            Thread t = new Thread(new TestThread(tespizza,numero));
            t.start();
            int numero2= numero+1;
            if(numero2<=size-1) {
                Thread t2 = new Thread(new TestThread(tespizza, numero2));
                t2.start();
            }
            numero=numero++;

        }
    }
}
