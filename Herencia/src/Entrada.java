import clases.ClaseA;
import clases.ClaseB;

import java.awt.*;

public class Entrada {
    public static void main(String[] args) {
        ClaseA claseA = new ClaseA("objeto de clase A", "A", 1);
        claseA.mostrarDatos();
        ClaseB claseB = new ClaseB("Objetode claseB", "B", 2, false);
        claseB.mostrarDatos();

        Point punto = new Point(1, 3);
        punto.move(1, 1);
        punto.translate(1, 1);
    }
}
