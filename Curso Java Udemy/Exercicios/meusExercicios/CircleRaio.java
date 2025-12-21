package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class CircleRaio {
    public static void main(String[] args) {
        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        IO.println("Descobrindo a área de um Circulo...");

        double raio, pi, area;
        System.out.print("Informe o valor do raio: ");

        raio = sc.nextDouble();
        pi = Math.PI;
        area = pi * Math.pow(raio, 2.0);

        System.out.printf("Resultado: A área total do círculo é de %.4fm²%n", area);

        sc.close();
    }
}
