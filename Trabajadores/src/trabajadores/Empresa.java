package trabajadores;

import java.util.Hashtable;

public class Empresa {

    int numeroVotos;
    Hashtable<String, Trabajador> listaTrabajadores;

    public Empresa(){
        listaTrabajadores = new Hashtable();
    }

    public void agregarTrabajador(Trabajador trabajador){
        listaTrabajadores.put(trabajador.getDni(), trabajador);
    }

    public void registrarVotos(Directivo directivo, int valor){
        numeroVotos = numeroVotos + directivo.emitirVoto(valor);
    }




}
