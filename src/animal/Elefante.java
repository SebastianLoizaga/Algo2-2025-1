package animal;

public class Elefante extends Animal{
    private int cantidadMemoria;

    public Elefante(String nombre, int edad, int cantidadMemoria){
        super(nombre, edad);
        this.cantidadMemoria = cantidadMemoria;
    }

    public int obtenerCantidadMemoria(){
        return this.cantidadMemoria;
    }

    /* public int factorEnvejecimiento(){
        cuando este la clase lo completo.
    } */

    public void cumplirAnios(int cantidad){
        this.modificarEdad(this.obtenerEdad() * cantidad);
    }
}
