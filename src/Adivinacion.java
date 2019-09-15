import java.util.Scanner;

public class Adivinacion {

    public static void main(String[] args) {
        int random, num, cont = 1, cont2 = 1, partida = 1;
        int media = 0;
        String consulta = null;
        boolean continuar = true;
        Scanner sc;
        sc = new Scanner(System.in);
        random = (int) (Math.random() * 101);

        System.out.println(random);

        do {
            System.out.printf("Introduce un numero entero entre 1 y 100: \n");
            num = sc.nextInt();
            sc.nextLine();

            if (random == num) {
                System.out.printf("Has adivinado el numero!\n");
                partida++;
            } else
                cont++;

        } while (num != random);

        System.out.printf("Lo has intentado %d veces\n", cont);


        while (continuar) {
            cont2 = 1;
            System.out.printf("Quieres volver a jugar: (s/n):");
            consulta = sc.next();
            sc.nextLine();


            random = (int) (Math.random() * 101);
            System.out.println(random);


            do {
                System.out.printf("Introduce un numero entero entre 1 y 100: \n");
                num = sc.nextInt();
                sc.nextLine();

                if (random == num)
                    System.out.printf("Has adivinado el numero!\n");
                else
                    cont++;

            } while (num != random);

            System.out.printf("Lo has intentado %d veces\n", cont);


            System.out.printf("Quieres volver a jugar: (s/n):");
            consulta = sc.next();
            sc.nextLine();


            if (consulta.toLowerCase().equals("s")) {
                continuar = true;
                partida++;
            } else {
                continuar = false;
            }

        }
        System.out.printf("Has jugado %d veces\n", partida);
        media = (cont + cont2) / partida;
        System.out.printf("La media de intentos es: %d\n", media);
        System.out.println("Hasta pronto");

    }
}
