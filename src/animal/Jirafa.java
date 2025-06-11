package animal;

public class Jirafa extends Animal{
    private int longitudCuello;

    public Jirafa(String nombre, int edad, int longitudCuello){
        super(nombre, edad);
        this.longitudCuello = longitudCuello;
    }

    public int obtenerLongitudCuello(){
        return this.longitudCuello;
    }

    public void modificarLongitudCuello(int valor){
        this.longitudCuello = valor;
    }

    public int factorEnvejecimiento(){
        return 3;
    }
}
