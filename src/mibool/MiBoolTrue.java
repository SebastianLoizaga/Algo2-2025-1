package mibool;

public class MiBoolTrue extends MiBool{
    public MiBool miBoolNot(){
        return new MiBoolFalse();
    }

    public MiBool miBoolOr(MiBool b){
        return this;
    }

    public String toString(){
        return "**TRUE**";
    }
}
