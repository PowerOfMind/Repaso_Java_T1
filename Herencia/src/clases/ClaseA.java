package clases;

public class ClaseA {
    public String nombre, tipo;
    public int codigo;

    //public ClaseA(){}

    public ClaseA(String nombre, String tipo, int codigo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigo = codigo;
    }
    public void mostrarDatos(){
        System.out.printf("El nombre es %s \n", nombre);
        System.out.printf("El tipo es %s \n", tipo);
        System.out.printf("El codigo es %s \n", codigo);
    }
}
