package Aula01;

public class Mago extends Heroi{

    public void lancarMagia(Heroi alvo) {

        alvo.vida -= 15;
        System.out.println(this.nome + " lança uma Magia em " + alvo.nome +
                " causando 20 de dano");
    }

    public void aBatalha(Heroi alvo) {
        alvo.forca -= 150;

        System.out.println(this.nome + " lança aquela magia brabra em " + alvo.nome +
                " causando 150 de dano");

    }
}

