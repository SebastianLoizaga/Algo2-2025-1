package genin;

import interfaces.Caminante;
import java.util.Iterator;

public class GeneradorEnteros implements Iterator<Integer>, Iterable<Integer>, Caminante{
    private int valorProximo;
    private int valorFinal;
    private int step;

    public GeneradorEnteros(int valorInicial, int valorFinal, int step){
        super();
        this.valorProximo = valorInicial;
        this.valorFinal = valorFinal;
        this.step = step;
    }
    
    public boolean hasNext(){
        return (this.valorProximo <= this.valorFinal);
    }

    public Integer next(){
        Integer ret = this.valorProximo;
        this.valorProximo = this.valorProximo + this.step;
        return ret;
    }

    public Iterator<Integer> iterator() {
        return this;
    }

    public void caminar(){
        System.out.println("El generador de entero camina a paso firme.");
    }
}
