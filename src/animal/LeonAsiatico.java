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
        return "Nombre: " + this.obtenerNombre() + " // Edad: " + this.obtenerEdad() + " // Potencia rugido: " + this.obtenerPotenciaRugido() + " // Nivel chino: " + this.obtenerNivelComprensionChino();
    }

    public void cumplirAnios(int cantidad){
        this.modificarEdad(this.obtenerEdad() * cantidad);
    }
}