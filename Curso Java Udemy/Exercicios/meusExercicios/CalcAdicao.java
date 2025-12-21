package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcAdicao {
    static void main() {
        /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //capturando dados...
        int num1, num2;
        IO.println("===== Calculadora de adição básica ======");
        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = sc.nextInt();

        System.out.printf("A soma de %d e %d é igual à %d%n", num1, num2, num1+num2);
        IO.print("=========================================");
        sc.close();
    }
}
