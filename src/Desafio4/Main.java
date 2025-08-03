package Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor = 0.0;
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Conta contaTitular = new Conta("Gabriel", "12345");
        Conta contaDestino = new Conta("Carlos", "56789");
        do {
            System.out.println("Informe a operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Pagar");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do deposito:");
                    valor = sc.nextDouble();
                    contaTitular.depositar(valor);
                    break;
                case 2:
                    System.out.println("Informe o valor do saque:");
                    valor = sc.nextDouble();
                    contaTitular.sacar(valor);
                    break;
                case 3:
                    System.out.println("Informe o valor do transferir:");
                    valor = sc.nextDouble();
                    contaTitular.transferir(valor, contaDestino);
                    break;
                case 4:
                    System.out.println("Informe o valor a pagar:");
                    valor = sc.nextDouble();
                    contaTitular.pagar(valor);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 5);
    }
}
