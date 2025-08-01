package Desafio3;

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Alice", "alice@empresa.com", "admin123");


        System.out.println(admin.nome);
        System.out.println(admin.email);
        // System.out.println(admin.senha);     inacessível


        admin.exibirUsuario(); // final method

        System.out.println("Autenticado? " + admin.autenticar("errada")); // false
        System.out.println("Autenticado? " + admin.autenticar("admin123")); // true

        admin.redefinirSenha("minhaNovaSenha123");

        System.out.println("Autenticado após redefinir? " + admin.autenticar("minhaNovaSenha123")); // true

        String novaSenha = "minhaNovaSenha123";
        boolean senhaForte = SegurancaUtils.validarSenhaForte(novaSenha);
        System.out.println("Senha forte? " + senhaForte); // true
    }
}
