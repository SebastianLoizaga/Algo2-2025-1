package auxiliar;

//import principal.Ciudad; //importa solo la clase Ciudad del pakage principal
import principal.*; //Importa todas las clases del pakage

public class Persona {
    private String nombre;
    private int edad;
    private Ciudad ciudadNacimiento;
    private Color personalidad;
    private Fortaleza fort;

    public Persona(String nombre, int edad, Ciudad ciudadNacimiento, Color personalidad){
        this.modificarNombre(nombre);
        this.edad = edad;
        this.modificarCiudadNacimiento(ciudadNacimiento);
        this.personalidad = personalidad;
        this.fort = new Fortaleza(25);
    }

    public Persona(String nombre, Ciudad ciudadNacimiento, Color personalidad){
        this(nombre, 0, ciudadNacimiento, personalidad);
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    private void modificarNombre(String valor){
        this.nombre = valor;
    }

    public Ciudad obtenerCiudadNacimiento(){
        return this.ciudadNacimiento;
    }

    private void modificarCiudadNacimiento(Ciudad valor){
        this.ciudadNacimiento = valor;
    }

    public int obtenerEdad(){
        return this.edad;
    }

    public void cumplirAnios(int cantidad){
        this.edad = edad + cantidad;
    }

    public Color obtenerPersonalidad(){
        return this.personalidad;
    }

    private Fortaleza obtenerFortaleza(){
        return this.fort;
    }

    public String toString(){
        return "Nombre: " + this.obtenerNombre() + " // Edad: " + this.obtenerEdad() + " // Ciudad de Nacimiento: " + this.obtenerCiudadNacimiento() + " // Personalidad: " + this.obtenerPersonalidad();
    }

    private class Fortaleza{ //INNER CLASS
        private int magnitud;

        public Fortaleza(int magnitud){
            this.magnitud = magnitud;
        }

        public int obtenerMagnitud(){
            return this.magnitud;
        }
    }
}