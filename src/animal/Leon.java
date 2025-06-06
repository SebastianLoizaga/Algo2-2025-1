package animal;

public class Leon {
    private String nombre;
    private int edad;
    private int potenciaRugido;

    public Leon(String nombre, int edad, int potenciaRugido){
        //se crea un Leon originalmente como instancia de Object (superclase) con el constructor sin parametros
        this.nombre = nombre;
        this.edad = edad;
        this.potenciaRugido = potenciaRugido;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public void modificarNombre(String valor){
        this.nombre = valor;
    }

    public void modificarEdad(int valor){
        this.edad = valor;
    }

    public int obtenerEdad(){
        return this.edad;
    }

    public void cumplirAnios(int cantidad){
        this.edad = edad + cantidad;
    }

    public void modificarPotenciaRugido(int valor){
        this.potenciaRugido = valor;
    }

    public int obtenerPotenciaRugido(){
        return this.potenciaRugido;
    }

    public String toString(){
        return "Nombre: " + this.obtenerNombre() + " // Edad: " + this.obtenerEdad() + " // Potencia rugido: " + this.obtenerPotenciaRugido();
    }

    /* public boolean equals(Object obj){

    } */ //CUANDO LO SUBA COPIARLO
}
