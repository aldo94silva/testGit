package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double soma,subtrair,multiplicar,dividir = 0, n1, n2;
        Calculadora calculator = new Calculadora();
        System.out.print("Entre com o primeiro número: ");
        n1 = ler.nextDouble();

        System.out.println();
        System.out.print("Entre com o segundo número: ");
        n2 = ler.nextDouble();

        System.out.println();
        soma = calculator.somar(n1,n2);
        System.out.print("Soma " + soma);

        System.out.println();
        subtrair = calculator.subtrair(n1,n2);
        System.out.print("Subtração " + subtrair);

        System.out.println();
        multiplicar = calculator.multiplicar(n1,n2);
        System.out.print("Multiplicação " + multiplicar);

        System.out.println();
        dividir = calculator.dividir(n1,n2);
        System.out.print("Divisão " + dividir);
    }
}
