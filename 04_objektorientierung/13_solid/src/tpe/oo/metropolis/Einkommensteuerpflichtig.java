package tpe.oo.metropolis;

public interface Einkommensteuerpflichtig extends Steuerpflichtig {
    double STEUERSATZ_1=0.08;
    double STEUERSATZ_2=0.15;
    double STEUERSATZ_3=0.25;

    int einkommensteuer();

}
