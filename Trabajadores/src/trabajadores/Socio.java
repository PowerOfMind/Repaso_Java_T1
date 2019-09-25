package trabajadores;

public class Socio implements Directivo {
    String nombre, apellido, dni;
    int valorVoto;

    public Socio(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public int emitirVoto(int voto) {
        valorVoto = voto*2;
        return valorVoto;
    }

    @Override
    public void emitirOpinion(String opinion) {
        System.out.println(opinion.toUpperCase());
    }
}
