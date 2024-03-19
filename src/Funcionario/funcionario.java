package Funcionario;

public class funcionario {

    String nome;

    String departamento;

    double salario;


    public void aumentarSalario(double percentual){
        double aumento = this.salario * (percentual / 100);
        this.salario += aumento;
        System.out.print("Seu novo salário é: R$" + this.salario);
    }
}
