package clases;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class MenuGaraje {
    public static void main(String[] args) {
        String marca, modelo;
        boolean continuar;
        int bastidor, cv = 0;
        int opcion;
        Scanner sc;
        sc = new Scanner(System.in);
        Hashtable<String, Coche> garaje = new Hashtable();


        do {

            System.out.println("******************************************");
            System.out.println("********          MENU              ******");
            System.out.println("******************************************");
            System.out.printf("1. Agregar coche\n");
            System.out.printf("2. Sacar coche\n");
            System.out.printf("3. Acelerar coche\n");
            System.out.printf("4. Decelerar coche\n");
            System.out.printf("5. Listar garaje\n");
            System.out.printf("Escoge una opcion (6 para salir): ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {




                case 1:

                    System.out.println("Introduce el coche:");
                    marca = sc.next();
                    System.out.println("Introduce modelo:");
                    modelo = sc.next();
                    System.out.println("Introduce bastidor:");
                    bastidor = sc.nextInt();
                    System.out.println("Introduce cv:");
                    cv = sc.nextInt();
                    Coche coche = new Coche(marca, modelo, bastidor, cv);

                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcion != 6);

    }
}
