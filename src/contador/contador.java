package contador;

public class contador {

    double valor;

    public void incrementar(){
        this.valor ++;
    }
    public void decrementar(){
        this.valor--;
    }
    public void exibirValor(){
        System.out.print("O valor atual é: " + this.valor);
    }
}
