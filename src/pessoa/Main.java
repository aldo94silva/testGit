package pessoa;

public class Main {

    public static void main(String[] args) {
        // Scanner leia = new Scanner (Systen.in);

        pessoa pessoa1 = new pessoa();

        pessoa1.nome = "Aldo";
        pessoa1.cpf = "211.258.71.255-23";
        pessoa1.idade = 30;
        pessoa1.correr();
        System.out.println(pessoa1.nome);

        pessoa pessoa2 = new pessoa();
        pessoa2.nome = "Silva";
        pessoa2.cpf = "255.365.228.-25";
        pessoa2.nadou();
        System.out.println(pessoa2.nome);
        }
}
