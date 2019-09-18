package clases;

public class Coche {
    /*

    // VARIABLES


    //Constructor
    public Coche(){

    }

    //METODOS
    // acceso retorno nombre (param)
    public void acelerar(int velocidad){

    }
    public int velocidad(){
        return 0;
    }
    */

    private String marca, modelo, matricula;
    private int bastidor, cv;
    private int velocidad;

    // "seat", "Ibiza", 123, 123

    public Coche(String marca, String modelo, int bastidor, int cv, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.cv = cv;
        this.matricula = matricula;
    }

    public Coche(String seat, String ibiza, int i, int i1) {
    }


    public void acelerar() {
        velocidad = velocidad + 50;
    }

    public void acelerar(int vel) {
        velocidad = velocidad + vel;
    }

    public void decelerar() {
        /*if (velocidad -50 < 0){}
        else
        velocidad = velocidad - 50;
         */
        velocidadValida(50);
    }

    public void decelerar(int vel) {
        /*if (vel>velocidad){}
        else
        velocidad = velocidad - vel;
         */
        velocidadValida(vel);
    }

    public void velocidadValida(int velocidad) {
        if (this.velocidad > velocidad) {
            this.velocidad = this.velocidad - velocidad;
        }
    }

    public boolean estaParado() {
        boolean parado;
        if (velocidad > 0) {
            parado = false;
        } else
            parado = true;

        return parado;
    }

    public Coche() {
        this.marca = "generico";
        this.modelo = "generico";
        this.bastidor = 0;
        this.cv = 0;
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
}
