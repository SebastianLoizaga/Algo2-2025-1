package principal;

import animal.*;
import auxiliar.Color;
import auxiliar.Persona;
import interfaces.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import maybe.Maybe;

class Primera {
    public static int valor=5; // atributo de clase.
    public static void main(String[] args) {
        String s;
        s="Hola mundo!!!";
        System.out.println(s);
        System.out.println(8);
        Boolean b=true;
        Boolean b2=false;
        System.out.println(b);
        b = !b2;
        System.out.println(b);
        System.out.println(b && b2); //and
        System.out.println(b || b2); //or
        /*marca de inicio
         * de comentario
         */
        final int i=23; //final hace que i sea una constante por lo que no se puede cambiar su valor.
        int i2=15;
        System.out.println(i + i2); //or
        System.out.println(i == i2); //or
        if (i == 23){
            System.out.println("i es igual a 23");
            System.out.println("Si, son iguales");
        }else
            System.out.println("i es distinto a 23");
        int valor = imprimirNumero("j", Primera.valor, 20, 2);
        System.out.println(valor);
        Primera.valor=Primera.valor+2;
        System.out.println(imprimirNumero ("k",Primera.valor, 40, 1));
        Segunda.metodoVisualizador(56, "el valor de cincuenta y seis");
        Ciudad c = new Ciudad("Rosario");
        System.out.println("---------------------");
        c.mostrar();
        System.out.println("---------------------");
        Ciudad bsas = new Ciudad("Buenos Aires", 1200000);
        bsas.mostrar();
        System.out.println("---------------------");
        c.setearCantHabitantes(c.obtenerCantHabitantes()*2);
        System.out.println("Nueva cant de habitantes de c: " + c.obtenerCantHabitantes());
        Ciudad tuc = new Ciudad("Tucuman");
        System.out.println("---------------------");
        tuc.mostrar();
        System.out.println("---------------------");
        System.out.println(tuc); // llama automaticamente al toString() del objeto.
        String s2 = "hola";
        System.out.println(s2);
        s2 = s2 + " que tal";
        System.out.println(s2);
        int i3 = 8;
        invocar(i3);
        System.out.println(i3);
        invocar(tuc);
        System.out.println(tuc);
        //Persona p = new Persona("Juan",25,tuc);
        final Persona p2 = new Persona("Laura",25,new Ciudad("Bahia Blanca", 500000),Color.ROJO);
        System.out.println(p2);
        int ii = 6;
        Integer ii2 = ii; //clases WRAPPERS
        Leon l = new Leon("Clarence",20,20);
        System.out.println(l);
        l.cumplirAnios(3);
        System.out.println(l);
        LeonAsiatico la = new LeonAsiatico("Coronel",10,1,1);
        System.out.println(la);
        int jj1 = 4;
        int jj2 = 5;
        System.out.println(jj1 == jj2); // la igualdad de tipos es de valores
        Leon l2 = l;
        System.out.println(l == l2);
        Leon l3 = new Leon("Clarence",23,10);
        System.out.println(l == l3);
        //System.out.println(new Leon() == new Leon()); //la igualdad de objetos es de identidades
        System.out.println(l.equals(l3));
        System.out.println("Hola" == "Hola"); //ver la identidad de string
        /* Leon l4 = null;
        l4.modificarNombre("Josecito"); */
        // Leon l4 = new LeonAsiatico(); //es valido gracias al polimorfismo de inclusion
        Leon l4 = null;
        Object oo = new Object();
        if (l3.obtenerPotenciaRugido() == 10){
            l4 = new LeonAsiatico("Coronel",10,1,1); //UPCASTING
        } else{
            l4 = (Leon)oo; //DOWNCASTING
        }
        alterarLeon(l4,"Leon IV");
        //l4.modificarNivelComprensionChino(7); //no lo permite porque l4 es de tipo super clase Leon y el motodo es de tipo clase LeonAsiatico.
        System.out.println(l4.toString());
        System.out.println(l4.equals(la));
        LeonAsiatico laa = new LeonAsiatico("Claurencio", 15, 8, 0);
        Animal j1 = new Jirafa("Jira Jira", 13, 11);
        j1.cumplirAnios(5);
        System.out.println("Edad de la jirafa: " + j1.obtenerEdad());
        j1 = new Leon("Lionel",3,70);
        j1.cumplirAnios(8);
        System.out.println("Edad de la leon: " + j1.obtenerEdad());
        Animal j2 = new LeonAsiatico("Liones Chino", 5, 70, 3);
        System.out.println("Edad del leon Liones Chino: " + j2.obtenerEdad());
        System.out.println(j2.toString());
        ArrayList aa = new ArrayList(); //raw types
        aa.add(new Ciudad("Salta",2352354));
        aa.add(7);
        aa.add(j2);
        System.out.println(aa.size()); //size cantidad de elementos de la lista
        Object ccc = aa.get(0); //get devuelte un object.
        System.out.println(ccc.toString());
        System.out.println(((Ciudad) ccc).obtenerCantHabitantes());
        Object ii3 = aa.get(1);
        System.out.println(((Integer) ii3) * 2);
        ArrayList<Ciudad> aa2 = new ArrayList<Ciudad>();
        aa2.add(new Ciudad("Salta",2352354));
        aa2.add(tuc);
        aa2.add(bsas);
        // aa2.add(j2); //esto no se puede porque declare que la lista es de Ciudad y no son de la clase Ciudad.
        HashMap<String, Ciudad> hm = new HashMap<String, Ciudad>();
        hm.put("Norte", new Ciudad("Salta", 2352354));
        hm.put("Sur", new Ciudad("Bariloche", 235235));
        hm.put("Este", new Ciudad("Concepcion del Uruguay", 80000));
        hm.put("Oeste", new Ciudad("Mendoza", 200000));
        System.out.println(hm.get("Este"));
        Maybe<Integer> mnada = new Maybe<Integer>();
        Maybe<Persona> mAlgoP = new Maybe<>(p2);
        System.out.println(mAlgoP.getValue().toString());
        LeonAsiatico la2 = new LeonAsiatico("paco", 2, 2, 4);
        Animal a = new Jirafa(s2, jj2, i);
        la2.verificacionParCovContravInv(a);
        la2.verificacionParCovContravInv(new Elefante(s2, jj2, i));
        //----------------ARRANCA INTERFACES----------------//
        Volador av = new Avion(70000);
        //System.out.println(av.obtenerKmRecorridos());
        av.volar();
        Volador sup = new Superman();
        sup.volar();
        System.out.println("-----------------");
        hacerVolar(av);
        hacerVolar(sup);
        hacerVolar(new Pajaro());
        List<Integer> aai = new ArrayList<Integer>();
        aai.add(24);
        aai.add(48);
        aai.add(0);
        System.out.println("-----------------");
        for(int cant=0; cant<=(aai.size()-1); cant++){
            System.out.println("Valor: " + aai.get(cant));
        }
        System.out.println("-----------------");
        for (Integer cant1:aai){
            System.out.println("Valor: " + cant1);
        }
        List<Ciudad> aa3 = new ArrayList<Ciudad>();
        aa3.add(new Ciudad("Bariloche", 235235));
        aa3.add(new Ciudad("Bariloche", 235235));
        aa3.add(new Ciudad("Bariloche", 235235));
        Iterable<Ciudad> it = aa3;
        for (Ciudad cant2:it){
            System.out.println("Valor: " + cant2.toString());
        }
    }

    private static void alterarLeon(Leon l,String valor) {
        l.modificarNombre(valor);
    }

    private static int imprimirNumero (String nvar,int desde, int hasta, int step){
        int k;
        for (k=desde;k<=hasta;k=k+step){
        System.out.println(nvar + " vale: " + k);
    }
    return k;
    }

    private static void invocar(int q){
        q = q + 2;
    } // al q ser una variable de tipo, se pasa como valor, al salir del motodo no se modifica el dato.
    
    private static void invocar(Ciudad c){
        //c = new Ciudad("Salta", 1324); // cambio la identidad de c
        c.setearNombre("Salta"); // no cambia la identidad de c
        c.setearCantHabitantes(1234);
    }

    private static void hacerVolar(Volador v){
        v.volar();
    }
}