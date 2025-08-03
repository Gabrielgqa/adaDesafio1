package Desafio4;

public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        exibirSaldo();
    }

    public void sacar(double valor) {
        if(saldo >= valor + 0.5) {
            saldo -= valor + 0.5;
            exibirSaldo();
        } else {
            System.out.println("Saldo insuficiente");
            exibirSaldo();
        }


    }

    public void transferir(double valor, Conta conta) {
        if(saldo >= valor + 0.5) {
            saldo -= valor + 0.5;
            conta.depositar(valor);
            exibirSaldo();
        } else {
            System.out.println("Saldo insuficiente");
            exibirSaldo();
        }

    }

    public void pagar(double valor) {
        if(saldo >= valor + 0.5) {
            saldo -= valor + 0.5;
            exibirSaldo();
        } else {
            System.out.println("Saldo insuficiente");
            exibirSaldo();
        }
    }

    public void exibirSaldo(){
        System.out.println("---------------------");
        System.out.println("Títular da conta: " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("---------------------");
    }
}
