package principal;

public class Ciudad {
    private String nombre;
    private int cantHabitantes;

    public Ciudad(String nombre, int cantHabitantes){
        this.setearNombre(nombre);
        this.setearCantHabitantes(cantHabitantes);
    } //constructor generico

    public Ciudad(String nombre){
        this(nombre, 1000000);
    } //constructor especifico
    
    public String obtenerNombre(){
        return nombre;
    } // motodos getter

    public void setearNombre(String nuevoNombre){
        nombre=nuevoNombre;
    } // metodos setter

    public int obtenerCantHabitantes(){
        return  cantHabitantes;
    }

    public void setearCantHabitantes(int nuevaCantHabitantes){
        cantHabitantes=nuevaCantHabitantes;
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.obtenerNombre()); //this solo es para mensajes de instancia.
        System.out.println("Cant de habitantes de c: " + this.obtenerCantHabitantes());
    }

    public String toString(){
        return "Nombre: " + this.obtenerNombre() + " // Cant de habitantes de c: " + this.obtenerCantHabitantes();
    } // modifica el toString() generico para hacerlo especifico para el objeto.
}