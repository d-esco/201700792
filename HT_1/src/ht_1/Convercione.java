package ht_1;

public class Convercione {

    public void Convercione(double pulgadas, double kilogramos) {
        Inicio in = new Inicio();
        double centimetros;

        double libras;
        if (pulgadas > 0 && kilogramos > 0) {
            centimetros = (pulgadas) * 2.54;
            libras = (kilogramos) * 2.205;
            System.out.println("pulgadas: " + pulgadas + " a centimetros: " + centimetros);
            System.out.println("kilogramos: " + kilogramos + " a libras: " + libras);
            in.Opcion(3);
        } else {
            System.out.println("adiós");
        }
    }

}
