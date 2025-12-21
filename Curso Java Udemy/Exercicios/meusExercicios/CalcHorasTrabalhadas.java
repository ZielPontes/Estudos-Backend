package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcHorasTrabalhadas {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        IO.println("Calculadora de Horas Trabalhadas");
        System.out.print("Informe nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Informe nome do salário mensal: ");
        double salario = sc.nextDouble();
        System.out.print("Informe quantidade de dias trabalhados: ");
        int diasTrabalhados = sc.nextInt();
        System.out.print("Quantas horas de trabalho por dia: ");
        int horasTrabalhadas = sc.nextInt();

        double diaria = salario/diasTrabalhados;
        System.out.printf("Funcionário: %s%n", nomeFuncionario);
        System.out.printf("Salário Mensal: %.2f%n", salario);
        System.out.printf("Dias Trabalhados: %d%n", diasTrabalhados);
        System.out.printf("Diária: %.2f%n", diaria);
        System.out.printf("Ganho por hora: %.2f%n", diaria/horasTrabalhadas);

        sc.close();
    }
}
