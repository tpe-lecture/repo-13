// TODO: JavaDoc
/**
 * Umrechnung von Währung
 * @autor kurnizkij
 * */
public class Waehrung {

    // TODO: JavaDoc
    /**
     * Kurs einer Währung eingebem
     * */
    private final int kurs;

    // TODO: JavaDoc
    /**
     * Name einer Währung eingeben
     * */
    private final String name;

    // TODO: JavaDoc
    /**
     * Kurzel einer Währung eigeben
     * */
    private final String kuerzel;

    // TODO: JavaDoc
    /**
     * Ganauigkeit bestimmen
     * */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    // TODO: JavaDoc
    /**
     * Umrechnung zweischen zwei Währungen
     *  @param betrag Der Betrag, der umgerechnet wird
     *  @param toWaerung In diese Waehrung umgerechnet wird
     *  @return gibt die umgerechnete aus
     * */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    // TODO: JavaDoc
    /**
     * Ausgabe von dem Kurs
     * */
    public int getKurs() {
        return kurs;
    }

    // TODO: JavaDoc
    /**
     * Ausgabe von Name
     * */
    public String getName() {
        return name;
    }

    // TODO: JavaDoc
    /**
     * Ausgabe von Kuerzel
     * */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
