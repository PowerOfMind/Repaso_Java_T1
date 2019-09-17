/**
 * @author Juan José Barriga
 */
public class Entrada {
    public static void main(String[] args) {
        String nombre = "Juan José";
        String apellido = "Barriga";
        int años = 23;

        int nota = 5;
        boolean salida;
        switch (nota){
            case 1:
                salida = true;
                break;
            case 2:
                salida = true;
                break;
            case 3:
                salida = true;
                break;
            case 4:
                salida = true;
                break;
            case 5:
                salida = false;
                break;
            default:
                salida = true;
                break;

        }
        System.out.println("La nota es: "+salida);

        System.out.printf("Hola me llamo %s %s tienes %d \n", nombre, apellido, años);
        System.out.printf("Adios!");
    }





}
