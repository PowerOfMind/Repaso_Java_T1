package ficheros;


import utiles.Alumno;

import java.io.*;
import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        /*
        ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();

        listaAlumno.add(new Alumno("N1", "", "", 1234));
        listaAlumno.add(new Alumno("N2", "", "", 1234));
        listaAlumno.add(new Alumno("N3", "", "", 1234));
        listaAlumno.add(new Alumno("N4", "", "", 1234));
        listaAlumno.add(new Alumno("N5", "", "", 1234));

        File ficheroAlumno = new File("RepasoClase/src/documentos/alumno.obj");
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream((new FileOutputStream(ficheroAlumno)));
            oos.writeObject(listaAlumno);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // lo hace siempre
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        */

        File ficherosAlumnos = new File("RepasoClase/src/documentos/alumno.obj");
        ObjectInputStream oii = null;
        ArrayList<Alumno> listaAlumno = null;

        try{
            oii = new ObjectInputStream(new FileInputStream(ficherosAlumnos));
            listaAlumno = (ArrayList<Alumno>) oii.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                oii.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(Alumno item: listaAlumno){
            System.out.println(item);
        }
    }



}
