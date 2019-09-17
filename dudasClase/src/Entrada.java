import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Hashtable<String, Alumno> listaHash = new Hashtable();
        //guardar datos
        listaHash.put("123F", new Alumno("Vinicius", "asd", "123F",123456));
        Alumno a = new Alumno("Nombre", "asd", "asd", 123);
        listaHash.put(a.getDni(),a);

        //borrar datos
        //String matBorrar = new Scanner(System.in);
        //listaHash.remove(matBorrar);

        //Está?
        if (listaHash.containsKey("123F")){
            System.out.println("Está ");
        }
        else
            System.out.println("No está");

        //sacar datos
        Alumno aEncontrado = listaHash.get("123F");
        System.out.println(aEncontrado.getNombre());

        //listar datos
        //listar los elementos
        Enumeration<Alumno> elementos = listaHash.elements();
        while (elementos.hasMoreElements()){
            Alumno al = elementos.nextElement();
            System.out.printf("Elnombre es %s y el apellido es %s \n",al.getNombre(),al.getApellido());
        }

        Enumeration<String> claves = listaHash.keys();
        while(claves.hasMoreElements()){
            String key = claves.nextElement();
            System.out.println(key);
            Alumno al = listaHash.get(key);
            System.out.println(al.getNombre());
        }
    }
}
