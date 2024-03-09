package heroiMago;

public class Mago extends Heroi{

    public void lancarMagia(Heroi alvo) {

        alvo.vida -= this.forca;
        System.out.println(this.nome + " lança uma Magia em " + alvo.nome +
                " e causou " + this.forca + " de dano");
    }

    public void aBatalha(Heroi alvo) {
        alvo.forca -= 150;

        System.out.println(this.nome + " lança aquela magia brabra em " + alvo.nome +
                " causando 150 de dano");

    }
}

