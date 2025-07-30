//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse", 99.90);

        p1.exibirResumo();
        p1.vender(3);
        p1.adicionarEstoque(5);
        p1.exibirResumo();

        p2.exibirResumo();
        p2.vender(1);
        p2.adicionarEstoque(10);
        p2.vender(2);
        p2.exibirResumo();
    }
}