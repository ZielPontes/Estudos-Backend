package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioHora {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        IO.println("Calculadora de Salário por hora");

        IO.println("Informe o nome do funcionário: ");
        String NomeFuncionario = sc.nextLine();

        System.out.print("Informe o ganho por hora trabalhada: ");
        double SalarioHora = sc.nextDouble();

        System.out.print("Quantas horas trabalhadas por dia: ");
        double HoraDia = sc.nextDouble();

        System.out.print("Quantos dias trabalhados?: ");
        int DiasTrabalhados = sc.nextInt();

        double SalarioMes = (SalarioHora * HoraDia) * DiasTrabalhados;

        System.out.printf("Funcionário: %s%n", NomeFuncionario);
        System.out.printf("Valor por hora: %.2f R$%n", SalarioHora);
        System.out.printf("Diária: %.2f R$%n", SalarioHora*HoraDia);
        System.out.printf("Salário Mensal: %.2f R$%n", SalarioMes);
        sc.close();
    }
}
