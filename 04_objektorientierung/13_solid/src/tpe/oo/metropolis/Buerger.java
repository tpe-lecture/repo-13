package tpe.oo.metropolis;

public class Buerger extends Menschen implements Einkommensteuerpflichtig{
    protected Buerger(String name, int einkommen){
        super(name, einkommen);
    }
    @Override
    public int einkommensteuer(){
        return 0;
    }
    @Override
    public double steuer(){
        return 0;
    }
}
