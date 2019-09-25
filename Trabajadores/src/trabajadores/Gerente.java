package trabajadores;

public class Gerente extends Trabajador implements Directivo {

    int valorVoto;

    public Gerente(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    @Override
    public void calcularSueldo() {
        this.sueldoMes = sueldo/12;
    }

    @Override
    public int emitirVoto(int voto) {
        valorVoto = voto/2;
        return valorVoto;
    }

    @Override
    public void emitirOpinion(String opinion) {
        System.out.println(opinion.toLowerCase());
    }
}
