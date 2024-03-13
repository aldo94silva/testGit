package contaBancaria;

public class contaBancaria {

    //atributos
    int numeroConta;

    String nomeDoTitualr;

    double saldo;

    //métodos

    public void depositar(double valor){
        this.saldo =+ valor;
    }
    public double sacar (double saque){
        if ((this.saldo >= 0) && (saque <= this.saldo  )){
            this.saldo = this.saldo - saque;
        }else {
            System.out.print(" Saldo insuficiente! ");
        }
        return this.saldo;
    }
    public void exibirSaldo(){
        System.out.print("Novo saldo: " + this.saldo);
    }

}
