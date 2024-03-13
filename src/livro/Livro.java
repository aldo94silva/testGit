package livro;

public class Livro {

    String titulo;
    String autor;
    int anoDePublicacao;

    public void exibir(){
        System.out.print("Titulo: " + this.titulo);
        System.out.println();
        System.out.print("Autor: " + this.autor);
        System.out.println();
        System.out.print("Ano Publicação: " + this.anoDePublicacao);
    }
}
