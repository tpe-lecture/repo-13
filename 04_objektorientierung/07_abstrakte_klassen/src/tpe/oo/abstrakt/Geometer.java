package tpe.oo.abstrakt;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        Figur[] figuren = new Figur[10];
      //  Dreieck[] dreiecke = new Dreieck[5];

        figuren[0] = new Kreis(10.0);
        figuren[1] = new Kreis(5.5);
        figuren[2] = new Kreis(3.3);
        figuren[3] = new Kreis(7.2);
        figuren[4] = new Kreis(8.0);

        figuren[5] = new Dreieck(4.0, 3.0);
        figuren[6] = new Dreieck(2.0, 1.0);
        figuren[7] = new Dreieck(5.0, 8.0);
        figuren[8] = new Dreieck(2.0, 7.2);
        figuren[9] = new Dreieck(14.0, 3.8);

        double gesamtflaeche = 0.0;

        for (Figur figur : figuren) {
            gesamtflaeche += figur.flaeche();
        }


        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);
    }
}
