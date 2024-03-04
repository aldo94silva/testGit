package Aula01;

public class Heroi {

    //Atributos classe heroi
    public String nome;
    int vida = 100;
    public int forca;

//    Métodos da classe Heroi
    public void atacar(Heroi alvo){
        alvo.vida -= this.forca; // this = essa/dessa
        System.out.println(this.nome + " ataca "  + alvo.nome + "e causa "
        + this.forca + " de dano" + " e fica com " + (this.forca-alvo.forca) + " de força");
    }

    public void curar(Heroi curou){
        this.vida += 20;
        System.out.println(this.nome + " se cura e agora tem " + this.vida +
                " de vida");
    }
}
