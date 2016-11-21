package tpe.oo.metropolis;

public class Schurke extends Mutanten implements Einkommensteuerpflichtig {
    protected Superkraft schwaeche;

    public Schurke(String name, int einkommen, String mutation,
            Superkraft schwaeche) {
        super(name, einkommen, mutation);
        this.schwaeche = schwaeche;
    }

    @Override
    public double steuer() {

        return 0;
    }

    @Override
    public int einkommensteuer() {

        return 0;
    }
}
