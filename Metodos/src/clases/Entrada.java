package clases;

public class Entrada {
    public static void main(String[] args) {

        Coche coche = new Coche();
        Coche coche1 = new Coche("seat", "ibiza", 123, 123);
        System.out.printf("Antes de modificar, los cv son: %d\n", coche1.getCv());
        coche1.setCv(200);
        System.out.printf("Despues de modificar, los cv son: %d\n",coche1.getCv());
        System.out.printf("La velocidad del coche, son: %d\n",coche1.getVelocidad());
        coche1.acelerar();
        System.out.printf("La velocidad del coche, son: %d\n",coche1.getVelocidad());
        coche1.acelerar();
        System.out.printf("La velocidad del coche, son: %d\n",coche1.getVelocidad());
        coche1.acelerar(100);
        System.out.printf("La velocidad del coche, son: %d\n",coche1.getVelocidad());
        coche1.decelerar();
        System.out.printf("La velocidad del coche, son: %d\n",coche1.getVelocidad());
        coche1.decelerar(200);
        if (coche1.estaParado()){
            System.out.println("El coche esta parado");
        } else
            System.out.println("El coche esta en movimiento");
    }
}
