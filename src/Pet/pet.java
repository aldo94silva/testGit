package Pet;

public class pet {

    String nome;
    String especie;
    int idade;

    public void informacoesPet(){
        System.out.print("Nome: " + this.nome);
        System.out.println();
        System.out.print("Espécie: " + this.especie);
        System.out.println();
        System.out.print("Idade: " + this.idade + " anos" +
                "");
    }

}
