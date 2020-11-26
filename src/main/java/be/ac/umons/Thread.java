package be.ac.umons;
import be.ac.umons.PizzaComponent;

import java.lang.Thread;
import java.util.ArrayList;

class TestThread extends Thread {
    private ArrayList<PizzaComponent>tespizza;
    private int size;
    private int i;
    public TestThread(ArrayList<PizzaComponent> tespizza, int size, int i) {
        super();
        this.tespizza=tespizza;
        this.size=size;
        this.i=i;
    };

    public void run() {
        if(size>=2){
            System.out.println(" Traitement des pizza:" + (tespizza.get(i)).getName() + "  " + (tespizza.get(i + 1)).getName());
        }
        else{
            System.out.println(" Traitement de la dernière Pizza:" + (tespizza.get(i)).getName() );
        }

    }

    }

