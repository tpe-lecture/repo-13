package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {
    private final Random rnd = new Random();

    private final WuerfelTyp typ;;

    /**
     * Einen neuen Würfel anlegen.
     *
     * @param numSides Anzahl der Seiten des Würfels.
     */
    public Wuerfel(WuerfelTyp typ) {
        this.typ = typ;
    }
    public int roll(){

        return rnd.nextInt(typ.getSeiten()+1);
    }
    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    /*public int roll() {
        return rnd.nextInt(numSides) + 1;
    }
    */

}
