package mibool;

public class MiBoolFalse extends MiBool{
    public MiBool miBoolNot(){
        return new MiBoolTrue();
    }

    public MiBool miBoolOr(MiBool b){
        return b;
    }

    public String toString(){
        return "**FALSE**";
    }
}
