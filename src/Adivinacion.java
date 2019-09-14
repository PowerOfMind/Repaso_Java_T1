import java.util.Scanner;

public class Adivinacion {

    public static void main(String[] args) {
        int random, num, cont = 0;
        String consulta = null;
        boolean continuar = false;
        Scanner sc;
        sc = new Scanner(System.in);
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

            System.out.printf("Lo has intentado %d veces\n", cont);
        } while (num != random);

        /* ************************************************* */
        System.out.printf("Quieres volver a jugar: (s/n):");
        consulta = sc.next();
        sc.nextLine();

        if (consulta.toLowerCase().equals("s")) {
            continuar = true;
        } else {
            continuar = false;
        }
        /* ************************************************* */
    }
}
