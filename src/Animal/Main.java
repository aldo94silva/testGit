package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        animal animal1 = new animal();

        animal1.nome = "Pelúcia";
        animal1.tipoDeAnimal = "Gato";
        animal1.idade = 2;
        System.out.print("Entre com o som do animal: ");
        String som = ler.next();
        animal1.emitirSom(som);
    }
}
