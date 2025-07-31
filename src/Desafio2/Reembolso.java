package Desafio2;

public class Reembolso {
    private  String nomeFuncionario;
    private int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularReembolso(double alimentacao, double transporte, double hospedagem){
        return alimentacao + transporte + hospedagem;
    }

    public double calcularReembolso(double alimentacao, double transporte){
        return alimentacao + transporte;
    }

    public void imprimirResumoReembolso(double valorTotal){
        if(diasTrabalhados > 7){
            valorTotal += valorTotal*0.1;
        }
        System.out.printf("Funcionário: %s - Dias trabalhados: %d - Reembolso Total: %.2f%n", nomeFuncionario, diasTrabalhados, valorTotal);
    }
}
