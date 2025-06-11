package maybe;

public class Maybe<T> {
    private T valor;
    
    public Maybe(){
        super();
        this.valor = null;
        //this(null); //otra forma de crear el constructor
    }

    public Maybe(T valor){
        super();
        this.valor = valor;
    }

    public boolean inNothing(){
        return (this.valor == null);
    }

    public T getValue(){
        return this.valor;
    }
}
