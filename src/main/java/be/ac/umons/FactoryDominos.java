package be.ac.umons;
import java.util.Scanner;
import java.util.ArrayList;
public class FactoryDominos extends AbstractFactory {

    private static FactoryDominos Dominos=null;
    public static  FactoryDominos getFactory() {
        if (Dominos==null) {
            return new FactoryDominos();
        }
        return Dominos;

    }

    static int stockP=2;
    static int stockM=2;
    static int stockF=2;
    static int stockC=2;
    @Override
    public Pizza createPizza(String name) {
        if (name=="Prosciutto" && stockP>0){
            stockP--;
            Prosciutto tmp=new Prosciutto();

            return tmp;
        }
        else if (name=="FruttiDiMare" && stockF>0){
            stockF--;
            FruttiDiMare tmp=new FruttiDiMare();

            return tmp;
        }
        else if (name=="Carbonara" && stockC>0){
            stockC--;
            Carbonara tmp=new Carbonara();

            return tmp;
        }
        else if (name=="Margherita" && stockM>0){
            stockM--;
            Margherita tmp=new Margherita();

            return tmp;
        }
        else{
            return null;
        }
    }
    public void NbrCommande(){
        int j=0;
        int numero=0;
        int deco;
        ArrayList<String>Choix=new ArrayList<String>();
        ArrayList<String>TesPizza=new ArrayList<String>();
        Choix.add("Proscuitto");
        Choix.add("FruttiDiMare");
        Choix.add("Margheritha");
        Choix.add("Carbonara");
        ;


        Scanner cin= new Scanner(System.in);
        System.out.println("Combien de pizza voulez");
        int number=cin.nextInt();
        for(j=0;j<number;j++){
            do {
                System.out.println("Entrez le numero associé à la pizza ente 0 et 3");
                System.out.println("(0)Proscuitto,(1)FruttiDiMare,(2)Margheritha,(3)Carbonara");
                numero=cin.nextInt();

            }while(numero!=0||numero!=1||numero!=2||numero!=3);

             String name1=Choix.get(numero);
            Pizza p=createPizza(name1);
            do {
                System.out.println("Voici les décorations supplémentaires :(0)Rien,(1)Cheesy,(2)Pan");
                deco=cin.nextInt();
            }while(deco!=0||deco!=1||deco!=2);
            if (deco==1){
                Cheesy p2= new Cheesy(p);
                break;


            }
            else if (deco==2){
                Pan p2= new Pan(p);
                break;

            }
            else {
                break;

            }

        }










    }












}
