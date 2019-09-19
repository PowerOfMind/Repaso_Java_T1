package clases;

import java.util.Enumeration;
import java.util.Hashtable;

public class Garaje {
    Hashtable<String, Coche> garaje;

    public Garaje(){
        garaje = new Hashtable();
    }

    public void agregarCoche(Coche coche){
        if (garaje.containsKey(coche.getMatricula())){
            Coche cocheEncontrado = garaje.get(coche.getMatricula());
            if (!cocheEncontrado.isDentro()){
                if (cocheEncontrado.getVelocidad()==0){
                    cocheEncontrado.setDentro(true);
                }
            }
        }else{
            garaje.put(coche.getMatricula(), coche);
        }

    }

    public void sacarCoche(String matricula){


        if (garaje.containsKey(matricula)){
            garaje.get(matricula).setDentro(false);
        }else{
            /*
            System.out.println("el coche no se encuentra en la plaza");
            */
        }

    }

    public void listarCoches(){
        Enumeration<Coche> elementos = garaje.elements();
        while(elementos.hasMoreElements()){
            Coche coche = elementos.nextElement();
            System.out.println(coche);
        }
    }



}
