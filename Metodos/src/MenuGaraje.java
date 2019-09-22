import clases.Coche;
import clases.Garaje;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class MenuGaraje {
    public static void main(String[] args) {


        int opcion;
        Garaje garaje = new Garaje();
        Scanner sc;
        sc = new Scanner(System.in);


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
                    String matricula, marca, modelo;
                    int bastidor, cv;
                    System.out.println("***Opcion agregar coche***");
                    System.out.println("Introduce la matricula:");
                    matricula = sc.next();
                    sc.nextLine();
                    System.out.println("Introduce la marca:");
                    marca = sc.next();
                    sc.nextLine();
                    System.out.println("Introduce el modelo:");
                    modelo = sc.next();
                    sc.nextLine();
                    System.out.println("Introduce el bastidor:");
                    bastidor = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce los cv:");
                    cv = sc.nextInt();
                    sc.nextLine();

                    Coche coche = new Coche(marca, modelo, bastidor, cv, matricula);
                    garaje.agregarCoche(coche);
                    break;


                case 2:
                    String matriculaSacar;
                    System.out.println("Introduce la matricula que quieres sacar");
                    matriculaSacar= sc.next();
                    sc.nextLine();
                    garaje.sacarCoche(matriculaSacar);
                    break;


                case 3:
                    int velocidad;
                    String matriculaAcelerar;
                    System.out.println("Introduce la matricula del coche que quieres acelerar:");
                    matricula = sc.next();
                    sc.nextLine();
                    System.out.println("Introduce la velocidad que quieres acelerar:");
                    velocidad = sc.nextInt();
                    sc.nextLine();

                    break;


                case 4:
                    break;


                case 5:
                    break;
            }
        } while (opcion != 6);

    }
}
