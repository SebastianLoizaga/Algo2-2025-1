package interfaces;

public class Avion implements Volador{
    private int kmRecorridos;
    
    public Avion(int valor){
        super();
        this.kmRecorridos = valor;
    }

    public int obtenerKmRecorridos(){
        return this.kmRecorridos;
    }

    public void volar(){
        System.out.println("El avion vuela, con " + this.obtenerKmRecorridos() + " km.");
    }
}
