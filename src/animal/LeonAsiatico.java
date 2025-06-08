package animal;

public class LeonAsiatico extends Leon {
    private int nivelComprensionChino;

    public LeonAsiatico(String nombre, int edad, int potenciaRugido,int nivelComprensionChino){
        super(nombre, edad, potenciaRugido);
        this.modificarNivelComprensionChino(nivelComprensionChino);
    }
    
    public void modificarNivelComprensionChino(int valor){
        this.nivelComprensionChino = valor;
    }
    
    public int obtenerNivelComprensionChino(){
        return this.nivelComprensionChino;
    }

    public String toString(){
        return super.toString() + " // Nivel chino: " + this.obtenerNivelComprensionChino();
        /* super.toString() llama al toString de la superclase. 
        Si llamo a this.toString entra en bucle y se rompe por llamarse a si mismo infinita veces */
    }

    public void cumplirAnios(int cantidad){
        this.modificarEdad(this.obtenerEdad() * cantidad);
    }
}