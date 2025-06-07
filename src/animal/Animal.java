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

    public void modificarEdad(int valor){
        this.edad = valor;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public int obtenerEdad(){
        return this.edad;
    }

    abstract public void cumplirAnios(int cantidad);
}
