import clases.ClaseA;
import clases.ClaseB;

import java.awt.*;
import java.util.Hashtable;

public class Entrada {
    public static Hashtable<String, ClaseA> listaClases = new Hashtable();

    public static void main(String[] args) {
        ClaseA claseA = new ClaseA("Objeto de clase A", "A", 1);
        claseA.mostrarDatos();
        ClaseA claseB = new ClaseB("Objeto de clase B", "B", 2, false);
        claseB.mostrarDatos();

        agregarElemento(claseA);
        agregarElemento(claseB);

        ((ClaseB)claseB).mostrarDatos();
        /*Point punto = new Point(1, 3);
        punto.move(1, 1);
        punto.translate(1, 1);*/


    }
    public static void agregarElemento (ClaseA claseA){
        listaClases.put("111", claseA);
    }
}
