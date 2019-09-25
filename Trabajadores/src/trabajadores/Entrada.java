package trabajadores;

public class Entrada {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Trabajador asalariado = new Asalariado("", "", "", 50000, 15);
        Trabajador autonomo = new Autonomo("", "", "", 50000);
        empresa.agregarTrabajador(autonomo);
        empresa.agregarTrabajador(asalariado);

        Socio s = new Socio("", "", "");
        //Trabajador g = new Gerente("", "", "", 123);
        Gerente g2 = new Gerente("","", "", 1234);

        s.emitirOpinion("opinion de un socio");
        g2.emitirOpinion("opinion de UN gerente");

        empresa.registrarVotos(s, 10);
        empresa.registrarVotos(g2, 4);

        System.out.println(empresa.numeroVotos);
    }
}
