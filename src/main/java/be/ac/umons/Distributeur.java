package be.ac.umons;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Distributeur {

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
        ;


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
         return tespizza;

    }







    public void FaireCommande(ArrayList<PizzaComponent>tespizza){
        int j=0;
        int numero=0;
        int size= tespizza.size();
        Scanner cin= new Scanner(System.in);
        System.out.println("Combien de pizza voulez vous?");
        int number=cin.nextInt();
        while(size>=2){
            Thread t = new Thread(new TestThread(tespizza,size,numero));

            t.start();

            numero=numero+2;
         size=size-2;
        }










    }














}
