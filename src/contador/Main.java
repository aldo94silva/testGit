package contador;

public class Main {

    public static void main(String[] args) {

        contador contador1 = new contador();
        contador1.valor = 10;

        contador1.decrementar();
        contador1.exibirValor();
        System.out.println();
        contador1.incrementar();
        contador1.exibirValor();
    }
}
