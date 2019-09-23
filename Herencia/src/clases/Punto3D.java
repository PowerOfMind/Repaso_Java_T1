package clases;

import java.awt.*;

public class Punto3D extends Point {
    int z;

    public Punto3D() {
    }

    public Punto3D(Point p) {
        super(p);
    }

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punto3D(int x, int y) {
        super(x, y);
    }
}
