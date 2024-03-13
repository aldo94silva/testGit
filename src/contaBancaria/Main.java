package contaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor;

        //criar o objeto contaBancaria

        contaBancaria conta1 = new contaBancaria();

        System.out.print("Informe o valor: ");
        valor = ler.nextDouble();
        conta1.depositar(valor);
        conta1.exibirSaldo();
        System.out.println();
        System.out.print("Digite o valor do saque: ");
        double saque = ler.nextDouble();
        conta1.sacar(saque);
        conta1.exibirSaldo();
    }
}
