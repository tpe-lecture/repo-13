package tpe.oo.metropolis;

public abstract class Mutanten extends Einwohner{
    protected String mutation;
    protected Mutanten(String name,int einkommen, String mutation){
        super(name,einkommen);
        this.mutation=mutation;
    }

}
