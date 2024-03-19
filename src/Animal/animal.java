package Animal;

public class animal {

    String nome;
    String tipoDeAnimal;
    int idade;

    public void emitirSom(String som){
        System.out.println("O animal " + this.tipoDeAnimal + " faz " + som);
    }
}
