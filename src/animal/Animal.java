package animal;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        super();
        this.modificarNombre(nombre);
        this.modificarEdad(edad);
    }

    public void modificarNombre(String valor){
        this.nombre = valor;
    }

    //protected hace que lo puedan utilizar tambien las subclases.
    protected void modificarEdad(int valor){
        this.edad = valor;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public int obtenerEdad(){
        return this.edad;
    }

    public void cumplirAnios(int cantidad){
        this.modificarEdad(this.obtenerEdad() + this.factorEnvejecimiento() * cantidad);
    }

    abstract public int factorEnvejecimiento(); //sus subclases tienen que desarrollar el metodo.
}
