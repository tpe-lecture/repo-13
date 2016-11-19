package tpe.oo.metropolis;

public interface Koerperschaftsteuerpflichtig extends Steuerpflichtig {
    double STEUERSATZ = 0.15;
    int koerperschaftsteuer();
}
