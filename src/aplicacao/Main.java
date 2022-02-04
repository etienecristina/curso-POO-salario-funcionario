package aplicacao;

import entidades.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Entre com os dados do funcionário: ");
        System.out.println("Nome: ");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Salário bruto: ");
        funcionario.setSalarioBruto(scanner.nextDouble());

        System.out.println("Imposto: ");
        funcionario.setImposto(scanner.nextDouble());

        System.out.println("Funcionário: "+ funcionario);

        System.out.println("Digite a porcentagem do aumento: ");
        funcionario.aumentoDeSalario(scanner.nextDouble());

        System.out.println("Atualização: "+funcionario);

        scanner.close();
    }
}
