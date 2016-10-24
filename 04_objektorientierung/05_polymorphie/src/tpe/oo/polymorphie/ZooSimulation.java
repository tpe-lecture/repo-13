package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();

        ZooTier[] tiere = new ZooTier[3];
         int i =0;

        tiere[i++] = new Affe("Charlie");
        tiere[i++] = new Gorilla("Buck");
        tiere[i++] = new Giraffe("Debbie");

        for (ZooTier tier : tiere){
            System.out.println(tier);
        }
        System.out.println("Fütterung...");

        for (ZooTier tier : tiere){
            futterstelle.gibFutter(tier);
            System.out.println(tier);
        }





    }
}
