package metodoConstrutor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = ler.next();
        System.out.print("Digite a espécie: ");
        String especie = ler.next();
        System.out.print("Digite a idade: ");
        int idade = ler.nextInt();

        //Método contrutor para contruir o objeto
        pet pet1 = new pet(nome,especie,idade);
        pet pet2 = new pet();
        System.out.println();
        pet1.informacoesPet();
        pet2.informacoesPet();
    }
}
