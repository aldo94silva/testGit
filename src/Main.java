import heroiMago.Heroi;
import heroiMago.Mago;

public class Main {
    public static void main(String[] args) {

        Heroi heroi1 = new Heroi();
        heroi1.nome = " Arthur";
        heroi1.forca = 10;

        Heroi heroi2 = new Heroi();
        heroi2.nome = " Merlin ";
        heroi2.forca = 8;

        Mago mago1 = new Mago();
        mago1.nome = "Luizo Sonzo";
        mago1.forca = 9;

        heroi1.atacar(heroi2);
        System.out.println();
        heroi1.curar(heroi1);
        System.out.println();
        mago1.lancarMagia(heroi2);
        System.out.println();
        mago1.aBatalha(heroi1);

    }
}