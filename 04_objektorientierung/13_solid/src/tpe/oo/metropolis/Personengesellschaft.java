package tpe.oo.metropolis;

public class Personengesellschaft extends Unternehmen implements Einkommensteuerpflichtig{
    public double steuer(){
        return 0;
    }

    @Override
    public int gewerbesteuer() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int einkommensteuer() {
        // TODO Auto-generated method stub
        return 0;
    }

}
