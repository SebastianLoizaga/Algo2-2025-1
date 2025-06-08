package animal;

public class Leon extends Animal{
    private int potenciaRugido;

    public Leon(String nombre, int edad, int potenciaRugido){
        //se crea un Leon originalmente como instancia de Object (superclase) con el constructor sin parametros
        super(nombre, edad);
        this.potenciaRugido = potenciaRugido;
    }

    public void modificarPotenciaRugido(int valor){
        this.potenciaRugido = valor;
    }

    public int obtenerPotenciaRugido(){
        return this.potenciaRugido;
    }
    
    public void cumplirAnios(int cantidad){
        this.modificarEdad(this.obtenerEdad() + (cantidad /2));
    }

    public String toString(){
        return "Nombre: " + this.obtenerNombre() + " // Edad: " + this.obtenerEdad() + " // Potencia rugido: " + this.obtenerPotenciaRugido();
    }

    public boolean equals(Object obj){
        return (this.obtenerNombre().equals(((Leon) obj).obtenerNombre())) &&
    		(this.obtenerEdad() == (((Leon) obj).obtenerEdad())) && 
            (this.obtenerPotenciaRugido() == (((Leon) obj).obtenerPotenciaRugido()));
    }
}
