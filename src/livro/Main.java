package livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.titulo = "O Poder da Ação";
        livro1.autor = "Paulo Vieira";
        livro1.anoDePublicacao = 2015;
        livro1.exibir();

    }
}
