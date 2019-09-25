package clases;

public class ClaseB extends ClaseA {

    boolean modificado;

    public ClaseB(String nombre, String tipo, int codigo, boolean modificado) {
        super(nombre, tipo, codigo);
        this.modificado = modificado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Es modificado %b \n", modificado);
    }
    public void miMetodoParticular(){
        System.out.printf("Este metodo es solo del objeto de clase B \n");
    }
}
