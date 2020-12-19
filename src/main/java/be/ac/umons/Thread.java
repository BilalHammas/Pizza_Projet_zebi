package be.ac.umons;
import be.ac.umons.PizzaComponent;

import java.lang.Thread;
import java.util.ArrayList;

class TestThread extends Thread {
        private ArrayList<PizzaComponent> tespizza;
        private int i;
        public TestThread(ArrayList<PizzaComponent> tespizza, int i) {
            super();
            this.tespizza=tespizza;
            this.i=i;
        }

        public void run() {
            try {
                System.out.println("Traitement de la Pizza:" + (tespizza.get(i)).getName());
            } finally {
                System.out.println("donee");
            }
        }
    }

