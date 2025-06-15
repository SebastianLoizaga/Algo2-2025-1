package interfaces;

public class Superman implements Volador,CaminanteLigero{
    
    public void volar(){
        System.out.println("Superman vuela.");
    }

    public void caminar(){
        System.out.println("Superman camina.");
    }

    public void trotar(){
        System.out.println("Superman trota.");
    }
}
