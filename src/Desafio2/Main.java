package Desafio2;

public class Main {
    public static void main(String[] args) {

        Reembolso r1 = new Reembolso("Carla", 5);
        double total1 = r1.calcularReembolso(100.0, 50.0, 80.0);
        r1.imprimirResumoReembolso(total1);

        Reembolso r2 = new Reembolso("João", 10);
        double total2 = r2.calcularReembolso(120.0, 60.0);
        r2.imprimirResumoReembolso(total2);

        Reembolso r3 = new Reembolso("Gabriel", 8);
        double total3 = r3.calcularReembolso(150.0, 70.0, 100.0);
        r3.imprimirResumoReembolso(total3);
    }
}
