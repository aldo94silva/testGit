package metodoConstrutor;

public class pet {

    String nome;
    String especie;
    int idade;

    //Método Construtor
    //Cria um contrato de contrução
    //Não é utilizado algum tipo de retorno, pois ele é um método de criação
    // e também não será colocado o void
    public pet(String nome,String especie,int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    //Contrutor default ou padrão ou seja sem paramentros
    public pet(){

    }

    public void informacoesPet(){
        System.out.print("Nome: " + this.nome);
        System.out.println();
        System.out.print("Espécie: " + this.especie);
        System.out.println();
        System.out.print("Idade: " + this.idade + " anos" +
                "");
    }

}
