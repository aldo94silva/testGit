package contadorProva;

public class contadorProva {

    int valor;

    public void incrementar(){
        this.valor++;
    }
    public void decrementar(){
        this.valor--;
    }
    public void exibirValorAtual(){
        System.out.print("Seu valor atual é: " + this.valor);
    }
}
