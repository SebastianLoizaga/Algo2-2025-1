package mibool;

public abstract class MiBool {
    abstract public MiBool miBoolNot();
    
    abstract public MiBool miBoolOr(MiBool b);
    
    public MiBool miBoolAnd(MiBool b){
        return this.miBoolNot().miBoolOr(b.miBoolNot()).miBoolNot();
    }

    abstract public String toString();
}
