package clases;

import java.util.Hashtable;

public class Garaje {
    Hashtable<String, Coche> garaje;

    public Garaje(){
        garaje = new Hashtable();
    }
    public void meterCoche(Coche coche){
        garaje.put(coche.getMatricula(), coche);
    }
    public void sacarCoche(){}
}
