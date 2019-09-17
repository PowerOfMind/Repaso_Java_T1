import java.util.Arrays;
import java.util.Scanner;

public class ejcMenu {
    public static void main(String[] args) {
        boolean continuar=false;
        int opcion, random;
        Scanner sc;
        sc = new Scanner(System.in);
        int[] num = new int[50];


        do {

            System.out.println("******************************************");
            System.out.println("********          MENU              ******");
            System.out.println("******************************************");
            System.out.printf("1. Rellenar\n");
            System.out.printf("2. Listar\n");
            System.out.printf("3. Ordenar\n");
            System.out.printf("4. Vaciar\n");
            System.out.printf("5. Salir\n");
            System.out.printf("Escoge una opcion (0 para salir): ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion){
                case 1:
                    System.out.printf("Rellenar\n");
                    for (int i = 0; i < num.length ; i++) {
                        random = (int) (Math.random()*201);
                        num[i] = random;
                    }
                    break;
                case 2:
                    System.out.printf("Listar\n");
                    for (int i = 0; i <num.length; i++) {
                        System.out.printf("Elemento %d: %d\n",i,num[i]);
                    }
                    break;
                case 3:
                    System.out.printf("Ordenar \n");
                    Arrays.sort(num);
                    break;
                case 4:
                    System.out.printf("Vaciar \n");
                    for (int i = 0; i < num.length ; i++) {
                        num[i] = 0;
                    }
                    break;
            }
        }while (opcion!=5);
    }
}
