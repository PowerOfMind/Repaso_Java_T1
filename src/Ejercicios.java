// comentario
/*
 *
 *
 * */

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Juan J Barriga
 */

enum meses{
    enero, febrero, Septiembre;
}

public class Ejercicios {


    public static void main(String[] args) {

        String nombre;
        Scanner sc;
        int anio, mes, dia, hora, minutos;
        String saludoHora, saludoMes = null;
        boolean continuar = false;

        anio = Calendar.getInstance().get(Calendar.YEAR);
        mes = Calendar.getInstance().get(Calendar.MONTH);
        dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        minutos = Calendar.getInstance().get(Calendar.MINUTE);


        sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = sc.next();
        sc.nextLine();

        do{

            anio = Calendar.getInstance().get(Calendar.YEAR);
            mes = Calendar.getInstance().get(Calendar.MONTH);
            dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            minutos = Calendar.getInstance().get(Calendar.MINUTE);



            if (hora >= 6 && hora < 12) {
                saludoHora = "buenos días";
            } else if (hora < 20) {
                saludoHora = "buenos tardes";
            } else {
                saludoHora = "buenos noches";
            }

            switch (mes) {
                case 0:
                    saludoMes = meses.enero.toString();
                    break;
                case 1:
                    saludoMes = "Febrero";
                    break;
                case 2:
                    saludoMes = "Marzo";
                    break;
                case 3:
                    saludoMes = "Abril";
                    break;
                case 4:
                    saludoMes = "Mayo";
                    break;
                case 5:
                    saludoMes = "Junio";
                    break;
                case 6:
                    saludoMes = "Julio";
                    break;
                case 7:
                    saludoMes = "Agosto";
                    break;
                case 8:
                    saludoMes = meses.Septiembre.toString();
                    break;
                case 9:
                    saludoMes = "Octubre";
                    break;
                case 10:
                    saludoMes = "Noviembre";
                    break;
                case 11:
                    saludoMes = "Diciembre";
                    break;
            }

            System.out.printf("%s %s son las %d:%d del %d de %s de %d \n"
                    , saludoHora, nombre, hora, minutos, dia, saludoMes, anio);


            System.out.printf("Quieres realizar la consulta otra vez: (s/n):");
            String consulta = sc.next();
            sc.nextLine();

            if(consulta.toLowerCase().equals("s")){
                continuar = true;
            }else{
                continuar = false;
            }

        }while(continuar);
        System.out.printf("Que tengas un bien dia %s", nombre);
    }

}