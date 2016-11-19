package tpe.oo.metropolis;

public abstract class Einwohner {
    protected String name;
    protected double einkommen;

    protected Einwohner(String name, double einkommen) {

        this.name = name;
        this.einkommen = einkommen;
    }

}
