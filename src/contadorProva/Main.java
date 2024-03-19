package contadorProva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        contadorProva contador1 = new contadorProva();

        contador1.valor = 20;

        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();
        contador1.exibirValorAtual();

        System.out.println();

        contador1.decrementar();
        contador1.exibirValorAtual();
    }


}
