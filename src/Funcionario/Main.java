package Funcionario;

public class Main {
    public static void main(String[] args) {

        funcionario funcionario1 = new funcionario();

        funcionario1.nome = "Silva";
        funcionario1.departamento = "Compras";
        funcionario1.salario = 3000;
        funcionario1.aumentarSalario(10);

    }
}
