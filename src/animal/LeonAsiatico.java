package animal;

import auxiliar.Persona;

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

    public int factorEnvejecimiento(){
        return 10;
    }

    public void verificacionParCovContravInv(Animal e){
        System.out.println("Ejecucion subclase LeonAsiatico (par).");
    }

    public Persona verificacionResCovContravInv(){
        System.out.println("Ejecucion superclase Leon (res).");
        return new Persona("Juana",null,null);
    }
}