public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
        } else if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
