package clases;

public class Coche {


    // VARIABLES


    //CONSTRUCTORES

    private String marca, modelo, matricula;
    private int bastidor, cv;
    private int velocidad;
    private boolean dentro;

    // "seat", "Ibiza", 123, 123

    public Coche() {
        this.marca = "generico";
        this.modelo = "generico";
        this.bastidor = 0;
        this.cv = 0;
    }

    public Coche(String marca, String modelo, int bastidor, int cv, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.cv = cv;
        this.matricula = matricula;
        this.velocidad = 0;
        dentro = true;
    }

    public Coche(String seat, String ibiza, int i, int i1) {
    }


    //METODOS

    public void acelerar(int vel) {
        if (!isDentro()) {
            velocidad = velocidad + vel;

        }
    }

    public void decelerar(int vel) {
        if (velocidadValida(vel) && !isDentro()) {
            velocidad = velocidad - vel;
        }
    }


    public boolean velocidadValida(int velocidad) {
        if (this.velocidad >= velocidad) {
            return true;
        } else
            return false;
    }

    public boolean estaParado() {
        boolean parado;
        if (velocidad > 0) {
            parado = false;
        } else
            parado = true;

        return parado;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getBastidor() {
        return bastidor;
    }

    public int getCv() {
        return cv;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isDentro() {
        return dentro;
    }

    public void setDentro(boolean dentro) {
        this.dentro = dentro;
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() +
                "Marca: " + getMarca() +
                "Nº caballos: " + getCv() +
                "Bastidor" + getBastidor();
    }
}
